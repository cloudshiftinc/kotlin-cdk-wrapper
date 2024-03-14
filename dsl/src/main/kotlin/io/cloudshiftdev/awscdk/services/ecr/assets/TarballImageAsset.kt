package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class TarballImageAsset
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAsset,
) : CloudshiftdevConstructsConstruct(cdkObject) {
    /**
     * A hash of this asset, which is available at construction time.
     *
     * As this is a plain string, it can be used in construct IDs in order to enforce creation of a
     * new resource when the content hash has changed.
     */
    public open fun assetHash(): String = unwrap(this).getAssetHash()

    /**
     * The tag of this asset when it is uploaded to ECR.
     *
     * The tag may differ from the assetHash if a stack synthesizer adds a dockerTagPrefix.
     */
    public open fun imageTag(): String = unwrap(this).getImageTag()

    /**
     * The full URI of the image (including a tag).
     *
     * Use this reference to pull the asset.
     */
    public open fun imageUri(): String = unwrap(this).getImageUri()

    /**
     * The full URI of the image (including a tag).
     *
     * Use this reference to pull the asset.
     */
    public open fun imageUri(`value`: String) {
        unwrap(this).setImageUri(`value`)
    }

    /** Repository where the image is stored. */
    public open fun repository(): IRepository = unwrap(this).getRepository().let(IRepository::wrap)

    /** Repository where the image is stored. */
    public open fun repository(`value`: IRepository) {
        unwrap(this).setRepository(`value`.let(IRepository::unwrap))
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.assets.TarballImageAsset]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Absolute path to the tarball.
         *
         * It is recommended to to use the script running directory (e.g. `__dirname` in Node.js
         * projects or dirname of `__file__` in Python) if your tarball is located as a resource
         * inside your project.
         *
         * @param tarballFile Absolute path to the tarball.
         */
        public fun tarballFile(tarballFile: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder =
            software.amazon.awscdk.services.ecr.assets.TarballImageAsset.Builder.create(scope, id)

        /**
         * Absolute path to the tarball.
         *
         * It is recommended to to use the script running directory (e.g. `__dirname` in Node.js
         * projects or dirname of `__file__` in Python) if your tarball is located as a resource
         * inside your project.
         *
         * @param tarballFile Absolute path to the tarball.
         */
        override fun tarballFile(tarballFile: String) {
            cdkBuilder.tarballFile(tarballFile)
        }

        public fun build(): software.amazon.awscdk.services.ecr.assets.TarballImageAsset =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): TarballImageAsset {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return TarballImageAsset(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecr.assets.TarballImageAsset
        ): TarballImageAsset = TarballImageAsset(cdkObject)

        internal fun unwrap(
            wrapped: TarballImageAsset
        ): software.amazon.awscdk.services.ecr.assets.TarballImageAsset = wrapped.cdkObject
    }
}
