package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface VersionWeight {
    /** The version to route traffic to. */
    public fun version(): IVersion

    /** How much weight to assign to this version (0..1). */
    public fun weight(): Number

    /** A builder for [VersionWeight] */
    @CdkDslMarker
    public interface Builder {
        /** @param version The version to route traffic to. */
        public fun version(version: IVersion)

        /** @param weight How much weight to assign to this version (0..1). */
        public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.lambda.VersionWeight.Builder =
            software.amazon.awscdk.services.lambda.VersionWeight.builder()

        /** @param version The version to route traffic to. */
        override fun version(version: IVersion) {
            cdkBuilder.version(version.let(IVersion::unwrap))
        }

        /** @param weight How much weight to assign to this version (0..1). */
        override fun weight(weight: Number) {
            cdkBuilder.weight(weight)
        }

        public fun build(): software.amazon.awscdk.services.lambda.VersionWeight =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.lambda.VersionWeight,
    ) : VersionWeight {
        /** The version to route traffic to. */
        override fun version(): IVersion = unwrap(this).getVersion().let(IVersion::wrap)

        /** How much weight to assign to this version (0..1). */
        override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): VersionWeight {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.VersionWeight
        ): VersionWeight = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: VersionWeight
        ): software.amazon.awscdk.services.lambda.VersionWeight = (wrapped as Wrapper).cdkObject
    }
}
