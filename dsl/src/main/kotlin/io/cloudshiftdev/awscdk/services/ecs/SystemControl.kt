package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface SystemControl {
    /** The namespaced kernel parameter for which to set a value. */
    public fun namespace(): String

    /** The value for the namespaced kernel parameter specified in namespace. */
    public fun `value`(): String

    /** A builder for [SystemControl] */
    @CdkDslMarker
    public interface Builder {
        /** @param namespace The namespaced kernel parameter for which to set a value. */
        public fun namespace(namespace: String)

        /** @param value The value for the namespaced kernel parameter specified in namespace. */
        public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.SystemControl.Builder =
            software.amazon.awscdk.services.ecs.SystemControl.builder()

        /** @param namespace The namespaced kernel parameter for which to set a value. */
        override fun namespace(namespace: String) {
            cdkBuilder.namespace(namespace)
        }

        /** @param value The value for the namespaced kernel parameter specified in namespace. */
        override fun `value`(`value`: String) {
            cdkBuilder.`value`(`value`)
        }

        public fun build(): software.amazon.awscdk.services.ecs.SystemControl = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.SystemControl,
    ) : SystemControl {
        /** The namespaced kernel parameter for which to set a value. */
        override fun namespace(): String = unwrap(this).getNamespace()

        /** The value for the namespaced kernel parameter specified in namespace. */
        override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): SystemControl {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.SystemControl
        ): SystemControl = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: SystemControl
        ): software.amazon.awscdk.services.ecs.SystemControl = (wrapped as Wrapper).cdkObject
    }
}
