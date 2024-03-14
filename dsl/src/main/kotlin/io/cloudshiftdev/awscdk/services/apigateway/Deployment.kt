package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Deployment
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.Deployment,
) : Resource(cdkObject) {
    /**
     * Adds a component to the hash that determines this Deployment resource's logical ID.
     *
     * This should be called by constructs of the API Gateway model that want to invalidate the
     * deployment when their settings change. The component will be resolve()ed during synthesis so
     * tokens are welcome.
     *
     * @param data
     */
    public open fun addToLogicalId(`data`: Any) {
        unwrap(this).addToLogicalId(`data`)
    }

    /**  */
    public open fun api(): IRestApi = unwrap(this).getApi().let(IRestApi::wrap)

    /**  */
    public open fun deploymentId(): String = unwrap(this).getDeploymentId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Deployment]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The Rest API to deploy.
         *
         * @param api The Rest API to deploy.
         */
        public fun api(api: IRestApi)

        /**
         * A description of the purpose of the API Gateway deployment.
         *
         * Default: - No description.
         *
         * @param description A description of the purpose of the API Gateway deployment.
         */
        public fun description(description: String)

        /**
         * When an API Gateway model is updated, a new deployment will automatically be created.
         *
         * If this is true, the old API Gateway Deployment resource will not be deleted. This will
         * allow manually reverting back to a previous deployment in case for example
         *
         * Default: false
         *
         * @param retainDeployments When an API Gateway model is updated, a new deployment will
         *   automatically be created.
         */
        public fun retainDeployments(retainDeployments: Boolean)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigateway.Deployment.Builder =
            software.amazon.awscdk.services.apigateway.Deployment.Builder.create(scope, id)

        /**
         * The Rest API to deploy.
         *
         * @param api The Rest API to deploy.
         */
        override fun api(api: IRestApi) {
            cdkBuilder.api(api.let(IRestApi::unwrap))
        }

        /**
         * A description of the purpose of the API Gateway deployment.
         *
         * Default: - No description.
         *
         * @param description A description of the purpose of the API Gateway deployment.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * When an API Gateway model is updated, a new deployment will automatically be created.
         *
         * If this is true, the old API Gateway Deployment resource will not be deleted. This will
         * allow manually reverting back to a previous deployment in case for example
         *
         * Default: false
         *
         * @param retainDeployments When an API Gateway model is updated, a new deployment will
         *   automatically be created.
         */
        override fun retainDeployments(retainDeployments: Boolean) {
            cdkBuilder.retainDeployments(retainDeployments)
        }

        public fun build(): software.amazon.awscdk.services.apigateway.Deployment =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Deployment {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Deployment(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.Deployment
        ): Deployment = Deployment(cdkObject)

        internal fun unwrap(
            wrapped: Deployment
        ): software.amazon.awscdk.services.apigateway.Deployment = wrapped.cdkObject
    }
}
