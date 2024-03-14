package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.services.iam.PolicyDocument
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SpecRestApi internal constructor(
  private val cdkObject: software.amazon.awscdk.services.apigateway.SpecRestApi,
) : RestApiBase(cdkObject) {
  public override fun restApiId(): String = unwrap(this).getRestApiId()

  public override fun restApiRootResourceId(): String = unwrap(this).getRestApiRootResourceId()

  public override fun root(): IResource = unwrap(this).getRoot().let(IResource::wrap)

  public interface Builder {
    public fun apiDefinition(apiDefinition: ApiDefinition)

    public fun cloudWatchRole(cloudWatchRole: Boolean)

    public fun cloudWatchRoleRemovalPolicy(cloudWatchRoleRemovalPolicy: RemovalPolicy)

    public fun deploy(deploy: Boolean)

    public fun deployOptions(deployOptions: StageOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("758dc6f81ac3ea1bb90e059b8b088a10d0f4c3d7b156b649604d5e6112cd50bd")
    public fun deployOptions(deployOptions: StageOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun domainName(domainName: DomainNameOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b80c8a9c718f329563b24d3ba2819bfe2c6791a922296beffa47a707d25665db")
    public fun domainName(domainName: DomainNameOptions.Builder.() -> Unit)

    public fun endpointExportName(endpointExportName: String)

    public fun endpointTypes(endpointTypes: List<EndpointType>)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun minCompressionSize(minCompressionSize: Size)

    public fun parameters(parameters: Map<String, String>)

    public fun policy(policy: PolicyDocument)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae5a1977bcc2f7f39aed8bf4f99f237f97db6602689710c9620d5d6cfc9bad5f")
    public fun policy(policy: PolicyDocument.Builder.() -> Unit)

    public fun restApiName(restApiName: String)

    public fun retainDeployments(retainDeployments: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.SpecRestApi.Builder =
        software.amazon.awscdk.services.apigateway.SpecRestApi.Builder.create(scope, id)

    override fun apiDefinition(apiDefinition: ApiDefinition) {
      cdkBuilder.apiDefinition(apiDefinition.let(ApiDefinition::unwrap))
    }

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("758dc6f81ac3ea1bb90e059b8b088a10d0f4c3d7b156b649604d5e6112cd50bd")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b80c8a9c718f329563b24d3ba2819bfe2c6791a922296beffa47a707d25665db")
    override fun domainName(domainName: DomainNameOptions.Builder.() -> Unit): Unit =
        domainName(DomainNameOptions(domainName))

    override fun endpointExportName(endpointExportName: String) {
      cdkBuilder.endpointExportName(endpointExportName)
    }

    override fun endpointTypes(endpointTypes: List<EndpointType>) {
      cdkBuilder.endpointTypes(endpointTypes.map(EndpointType::unwrap))
    }

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun minCompressionSize(minCompressionSize: Size) {
      cdkBuilder.minCompressionSize(minCompressionSize.let(Size::unwrap))
    }

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun policy(policy: PolicyDocument) {
      cdkBuilder.policy(policy.let(PolicyDocument::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ae5a1977bcc2f7f39aed8bf4f99f237f97db6602689710c9620d5d6cfc9bad5f")
    override fun policy(policy: PolicyDocument.Builder.() -> Unit): Unit =
        policy(PolicyDocument(policy))

    override fun restApiName(restApiName: String) {
      cdkBuilder.restApiName(restApiName)
    }

    override fun retainDeployments(retainDeployments: Boolean) {
      cdkBuilder.retainDeployments(retainDeployments)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.SpecRestApi = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SpecRestApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SpecRestApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.SpecRestApi):
        SpecRestApi = SpecRestApi(cdkObject)

    internal fun unwrap(wrapped: SpecRestApi):
        software.amazon.awscdk.services.apigateway.SpecRestApi = wrapped.cdkObject
  }
}
