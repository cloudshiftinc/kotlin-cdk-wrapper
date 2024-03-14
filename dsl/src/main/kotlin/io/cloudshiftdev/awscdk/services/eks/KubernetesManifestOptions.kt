package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface KubernetesManifestOptions {
    /**
     * Automatically detect `Ingress` resources in the manifest and annotate them so they are picked
     * up by an ALB Ingress Controller.
     *
     * Default: false
     */
    public fun ingressAlb(): Boolean? = unwrap(this).getIngressAlb()

    /**
     * Specify the ALB scheme that should be applied to `Ingress` resources.
     *
     * Only applicable if `ingressAlb` is set to `true`.
     *
     * Default: AlbScheme.INTERNAL
     */
    public fun ingressAlbScheme(): AlbScheme? =
        unwrap(this).getIngressAlbScheme()?.let(AlbScheme::wrap)

    /**
     * When a resource is removed from a Kubernetes manifest, it no longer appears in the manifest,
     * and there is no way to know that this resource needs to be deleted.
     *
     * To address this, `kubectl apply` has a `--prune` option which will query the cluster for all
     * resources with a specific label and will remove all the labeld resources that are not part of
     * the applied manifest. If this option is disabled and a resource is removed, it will become
     * "orphaned" and will not be deleted from the cluster.
     *
     * When this option is enabled (default), the construct will inject a label to all Kubernetes
     * resources included in this manifest which will be used to prune resources when the manifest
     * changes via `kubectl apply --prune`.
     *
     * The label name will be `aws.cdk.eks/prune-&lt;ADDR&gt;` where `&lt;ADDR&gt;` is the 42-char
     * unique address of this construct in the construct tree. Value is empty.
     *
     * Default: - based on the prune option of the cluster, which is `true` unless otherwise
     * specified.
     *
     * [Documentation](https://kubernetes.io/docs/tasks/manage-kubernetes-objects/declarative-config/#alternative-kubectl-apply-f-directory-prune-l-your-label)
     */
    public fun prune(): Boolean? = unwrap(this).getPrune()

    /**
     * A flag to signify if the manifest validation should be skipped.
     *
     * Default: false
     */
    public fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

    /** A builder for [KubernetesManifestOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param ingressAlb Automatically detect `Ingress` resources in the manifest and annotate
         *   them so they are picked up by an ALB Ingress Controller.
         */
        public fun ingressAlb(ingressAlb: Boolean)

        /**
         * @param ingressAlbScheme Specify the ALB scheme that should be applied to `Ingress`
         *   resources. Only applicable if `ingressAlb` is set to `true`.
         */
        public fun ingressAlbScheme(ingressAlbScheme: AlbScheme)

        /**
         * @param prune When a resource is removed from a Kubernetes manifest, it no longer appears
         *   in the manifest, and there is no way to know that this resource needs to be deleted. To
         *   address this, `kubectl apply` has a `--prune` option which will query the cluster for
         *   all resources with a specific label and will remove all the labeld resources that are
         *   not part of the applied manifest. If this option is disabled and a resource is removed,
         *   it will become "orphaned" and will not be deleted from the cluster.
         *
         * When this option is enabled (default), the construct will inject a label to all
         * Kubernetes resources included in this manifest which will be used to prune resources when
         * the manifest changes via `kubectl apply --prune`.
         *
         * The label name will be `aws.cdk.eks/prune-&lt;ADDR&gt;` where `&lt;ADDR&gt;` is the
         * 42-char unique address of this construct in the construct tree. Value is empty.
         */
        public fun prune(prune: Boolean)

        /** @param skipValidation A flag to signify if the manifest validation should be skipped. */
        public fun skipValidation(skipValidation: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.eks.KubernetesManifestOptions.Builder =
            software.amazon.awscdk.services.eks.KubernetesManifestOptions.builder()

        /**
         * @param ingressAlb Automatically detect `Ingress` resources in the manifest and annotate
         *   them so they are picked up by an ALB Ingress Controller.
         */
        override fun ingressAlb(ingressAlb: Boolean) {
            cdkBuilder.ingressAlb(ingressAlb)
        }

        /**
         * @param ingressAlbScheme Specify the ALB scheme that should be applied to `Ingress`
         *   resources. Only applicable if `ingressAlb` is set to `true`.
         */
        override fun ingressAlbScheme(ingressAlbScheme: AlbScheme) {
            cdkBuilder.ingressAlbScheme(ingressAlbScheme.let(AlbScheme::unwrap))
        }

        /**
         * @param prune When a resource is removed from a Kubernetes manifest, it no longer appears
         *   in the manifest, and there is no way to know that this resource needs to be deleted. To
         *   address this, `kubectl apply` has a `--prune` option which will query the cluster for
         *   all resources with a specific label and will remove all the labeld resources that are
         *   not part of the applied manifest. If this option is disabled and a resource is removed,
         *   it will become "orphaned" and will not be deleted from the cluster.
         *
         * When this option is enabled (default), the construct will inject a label to all
         * Kubernetes resources included in this manifest which will be used to prune resources when
         * the manifest changes via `kubectl apply --prune`.
         *
         * The label name will be `aws.cdk.eks/prune-&lt;ADDR&gt;` where `&lt;ADDR&gt;` is the
         * 42-char unique address of this construct in the construct tree. Value is empty.
         */
        override fun prune(prune: Boolean) {
            cdkBuilder.prune(prune)
        }

        /** @param skipValidation A flag to signify if the manifest validation should be skipped. */
        override fun skipValidation(skipValidation: Boolean) {
            cdkBuilder.skipValidation(skipValidation)
        }

        public fun build(): software.amazon.awscdk.services.eks.KubernetesManifestOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestOptions,
    ) : KubernetesManifestOptions {
        /**
         * Automatically detect `Ingress` resources in the manifest and annotate them so they are
         * picked up by an ALB Ingress Controller.
         *
         * Default: false
         */
        override fun ingressAlb(): Boolean? = unwrap(this).getIngressAlb()

        /**
         * Specify the ALB scheme that should be applied to `Ingress` resources.
         *
         * Only applicable if `ingressAlb` is set to `true`.
         *
         * Default: AlbScheme.INTERNAL
         */
        override fun ingressAlbScheme(): AlbScheme? =
            unwrap(this).getIngressAlbScheme()?.let(AlbScheme::wrap)

        /**
         * When a resource is removed from a Kubernetes manifest, it no longer appears in the
         * manifest, and there is no way to know that this resource needs to be deleted.
         *
         * To address this, `kubectl apply` has a `--prune` option which will query the cluster for
         * all resources with a specific label and will remove all the labeld resources that are not
         * part of the applied manifest. If this option is disabled and a resource is removed, it
         * will become "orphaned" and will not be deleted from the cluster.
         *
         * When this option is enabled (default), the construct will inject a label to all
         * Kubernetes resources included in this manifest which will be used to prune resources when
         * the manifest changes via `kubectl apply --prune`.
         *
         * The label name will be `aws.cdk.eks/prune-&lt;ADDR&gt;` where `&lt;ADDR&gt;` is the
         * 42-char unique address of this construct in the construct tree. Value is empty.
         *
         * Default: - based on the prune option of the cluster, which is `true` unless otherwise
         * specified.
         *
         * [Documentation](https://kubernetes.io/docs/tasks/manage-kubernetes-objects/declarative-config/#alternative-kubectl-apply-f-directory-prune-l-your-label)
         */
        override fun prune(): Boolean? = unwrap(this).getPrune()

        /**
         * A flag to signify if the manifest validation should be skipped.
         *
         * Default: false
         */
        override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): KubernetesManifestOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.eks.KubernetesManifestOptions
        ): KubernetesManifestOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: KubernetesManifestOptions
        ): software.amazon.awscdk.services.eks.KubernetesManifestOptions =
            (wrapped as Wrapper).cdkObject
    }
}
