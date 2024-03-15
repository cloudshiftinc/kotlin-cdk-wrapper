@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface RestApiBaseProps {
  public fun cloudWatchRole(): Boolean? = unwrap(this).getCloudWatchRole()

  public fun cloudWatchRoleRemovalPolicy(): RemovalPolicy? =
      unwrap(this).getCloudWatchRoleRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun deploy(): Boolean? = unwrap(this).getDeploy()

  public fun deployOptions(): StageOptions? =
      unwrap(this).getDeployOptions()?.let(StageOptions::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

  public fun domainName(): DomainNameOptions? =
      unwrap(this).getDomainName()?.let(DomainNameOptions::wrap)

  public fun endpointExportName(): String? = unwrap(this).getEndpointExportName()

  public fun endpointTypes(): List<EndpointType> =
      unwrap(this).getEndpointTypes()?.map(EndpointType::wrap) ?: emptyList()

  public fun failOnWarnings(): Boolean? = unwrap(this).getFailOnWarnings()

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

  public fun restApiName(): String? = unwrap(this).getRestApiName()

  public fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()

  @CdkDslMarker
  public interface Builder {
    public fun cloudWatchRole(cloudWatchRole: Boolean)

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    public fun deploy(deploy: Boolean)

    public fun deployOptions(deployOptions: StageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8cc4a21277284909ec803ce2275769760bdaea1408a5add84fcf4c25bda48bc")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun domainName(domainName: DomainNameOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b005a8e64494593376c5797cb7dd1cc0fb207fe86138fa9a0f2790f898ba9f1c")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    public fun endpointExportName(endpointExportName: String)

    public fun endpointTypes(endpointTypes: List<EndpointType>)

    public fun endpointTypes(vararg endpointTypes: EndpointType)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun parameters(parameters: Map<String, String>)

    public fun policy(policy: PolicyDocument)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3f98602187c01121701f90e707637d68f8c24da15e7901228283fc1349da8c5")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun restApiName(restApiName: String)

    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RestApiBaseProps.Builder =
        software.amazon.awscdk.services.apigateway.RestApiBaseProps.builder()

    override fun cloudWatchRole(cloudWatchRole: Boolean) {
      cdkBuilder.cloudWatchRole(cloudWatchRole)
    }

    override fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy) {
      cdkBuilder.cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun deploy(deploy: Boolean) {
      cdkBuilder.deploy(deploy)
    }

    override fun deployOptions(deployOptions: StageOptions) {
      cdkBuilder.deployOptions(deployOptions.let(StageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8cc4a21277284909ec803ce2275769760bdaea1408a5add84fcf4c25bda48bc")
    override fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit): Unit =
        deployOptions(StageOptions(deployOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun domainName(domainName: DomainNameOptions) {
      cdkBuilder.domainName(domainName.let(DomainNameOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b005a8e64494593376c5797cb7dd1cc0fb207fe86138fa9a0f2790f898ba9f1c")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    override fun endpointTypes(vararg endpointTypes: EndpointType): Unit =
        endpointTypes(endpointTypes.toList())

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3f98602187c01121701f90e707637d68f8c24da15e7901228283fc1349da8c5")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RestApiBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RestApiBaseProps,
  ) : CdkObject(cdkObject), RestApiBaseProps {
    override fun cloudWatchRole(): Boolean? = unwrap(this).getCloudWatchRole()

    override fun cloudWatchRoleRemovalPolicy(): RemovalPolicy? =
        unwrap(this).getCloudWatchRoleRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun deploy(): Boolean? = unwrap(this).getDeploy()

    override fun deployOptions(): StageOptions? =
        unwrap(this).getDeployOptions()?.let(StageOptions::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Boolean? = unwrap(this).getDisableExecuteApiEndpoint()

    override fun domainName(): DomainNameOptions? =
        unwrap(this).getDomainName()?.let(DomainNameOptions::wrap)

    override fun endpointExportName(): String? = unwrap(this).getEndpointExportName()

    override fun endpointTypes(): List<EndpointType> =
        unwrap(this).getEndpointTypes()?.map(EndpointType::wrap) ?: emptyList()

    override fun failOnWarnings(): Boolean? = unwrap(this).getFailOnWarnings()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun policy(): PolicyDocument? = unwrap(this).getPolicy()?.let(PolicyDocument::wrap)

    override fun restApiName(): String? = unwrap(this).getRestApiName()

    override fun retainDeployments(): Boolean? = unwrap(this).getRetainDeployments()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RestApiBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RestApiBaseProps):
        RestApiBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RestApiBaseProps):
        software.amazon.awscdk.services.apigateway.RestApiBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RestApiBaseProps
  }
}
