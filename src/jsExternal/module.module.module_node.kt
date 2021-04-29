@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package module

import kotlin.js.*
import NodeJS.Require
import NodeModule
import NodeRequire
import url.URL

@JsModule("getModule")
external open class Module(id: String, parent: Module = definedExternally) : NodeModule {
    override var exports: Any
    override var require: Require
    override var id: String
    override var filename: String
    override var loaded: Boolean
    override var parent: NodeJS.Module?
    override var children: Array<NodeJS.Module>
    override var path: String
    override var paths: Array<String>
    interface SourceMapPayload {
        var file: String
        var version: Number
        var sources: Array<String>
        var sourcesContent: Array<String>
        var names: Array<String>
        var mappings: String
        var sourceRoot: String
    }
    interface SourceMapping {
        var generatedLine: Number
        var generatedColumn: Number
        var originalSource: String
        var originalLine: Number
        var originalColumn: Number
    }
    open class SourceMap(payload: SourceMapPayload) {
        open var payload: SourceMapPayload
        open fun findEntry(line: Number, column: Number): SourceMapping
    }

    companion object {
        fun runMain()
        fun wrap(code: String): String
        fun createRequireFromPath(path: String): NodeRequire
        fun createRequire(path: String): NodeRequire
        fun createRequire(path: URL): NodeRequire
        var builtinModules: Array<String>
        var Module: Any
        fun syncBuiltinESMExports()
        fun findSourceMap(path: String, error: Error = definedExternally): SourceMap
    }
}