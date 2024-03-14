package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public open class ResourceServerScope
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScope,
) {
    /** A description of the scope. */
    public open fun scopeDescription(): String = unwrap(this).getScopeDescription()

    /** The name of the scope. */
    public open fun scopeName(): String = unwrap(this).getScopeName()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.ResourceServerScope]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A description of the scope.
         *
         * @param scopeDescription A description of the scope.
         */
        public fun scopeDescription(scopeDescription: String)

        /**
         * The name of the scope.
         *
         * @param scopeName The name of the scope.
         */
        public fun scopeName(scopeName: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cognito.ResourceServerScope.Builder =
            software.amazon.awscdk.services.cognito.ResourceServerScope.Builder.create()

        /**
         * A description of the scope.
         *
         * @param scopeDescription A description of the scope.
         */
        override fun scopeDescription(scopeDescription: String) {
            cdkBuilder.scopeDescription(scopeDescription)
        }

        /**
         * The name of the scope.
         *
         * @param scopeName The name of the scope.
         */
        override fun scopeName(scopeName: String) {
            cdkBuilder.scopeName(scopeName)
        }

        public fun build(): software.amazon.awscdk.services.cognito.ResourceServerScope =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ResourceServerScope {
            val builderImpl = BuilderImpl()
            return ResourceServerScope(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.ResourceServerScope
        ): ResourceServerScope = ResourceServerScope(cdkObject)

        internal fun unwrap(
            wrapped: ResourceServerScope
        ): software.amazon.awscdk.services.cognito.ResourceServerScope = wrapped.cdkObject
    }
}
