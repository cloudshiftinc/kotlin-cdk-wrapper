package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnServiceProps {
  /**
   * The unique identifier of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-applicationidentifier)
   */
  public fun applicationIdentifier(): String

  /**
   * A description of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The endpoint type of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-endpointtype)
   */
  public fun endpointType(): String

  /**
   * The unique identifier of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-environmentidentifier)
   */
  public fun environmentIdentifier(): String

  /**
   * A summary of the configuration for the AWS Lambda endpoint type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
   */
  public fun lambdaEndpoint(): Any? = unwrap(this).getLambdaEndpoint()

  /**
   * The name of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-name)
   */
  public fun name(): String

  /**
   * The tags assigned to the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The summary of the configuration for the URL endpoint type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
   */
  public fun urlEndpoint(): Any? = unwrap(this).getUrlEndpoint()

  /**
   * The ID of the virtual private cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-vpcid)
   */
  public fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * A builder for [CfnServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationIdentifier The unique identifier of the application. 
     */
    public fun applicationIdentifier(applicationIdentifier: String)

    /**
     * @param description A description of the service.
     */
    public fun description(description: String)

    /**
     * @param endpointType The endpoint type of the service. 
     */
    public fun endpointType(endpointType: String)

    /**
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
     */
    public fun lambdaEndpoint(lambdaEndpoint: IResolvable)

    /**
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
     */
    public fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty)

    /**
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e55d27e38cead429a8d66fd2bd96794e6bcb3a239892e69d6c69110b0eefdb0b")
    public
        fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty.Builder.() -> Unit)

    /**
     * @param name The name of the service. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags assigned to the service.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the service.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param urlEndpoint The summary of the configuration for the URL endpoint type.
     */
    public fun urlEndpoint(urlEndpoint: IResolvable)

    /**
     * @param urlEndpoint The summary of the configuration for the URL endpoint type.
     */
    public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty)

    /**
     * @param urlEndpoint The summary of the configuration for the URL endpoint type.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17159304b0dec4c0b9633e5b97fb406060fcfea30e889bdb20021a6a468834b7")
    public fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty.Builder.() -> Unit)

    /**
     * @param vpcId The ID of the virtual private cloud (VPC).
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnServiceProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnServiceProps.builder()

    /**
     * @param applicationIdentifier The unique identifier of the application. 
     */
    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    /**
     * @param description A description of the service.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param endpointType The endpoint type of the service. 
     */
    override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    /**
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
     */
    override fun lambdaEndpoint(lambdaEndpoint: IResolvable) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(IResolvable::unwrap))
    }

    /**
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
     */
    override fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty) {
      cdkBuilder.lambdaEndpoint(lambdaEndpoint.let(CfnService.LambdaEndpointInputProperty::unwrap))
    }

    /**
     * @param lambdaEndpoint A summary of the configuration for the AWS Lambda endpoint type.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e55d27e38cead429a8d66fd2bd96794e6bcb3a239892e69d6c69110b0eefdb0b")
    override
        fun lambdaEndpoint(lambdaEndpoint: CfnService.LambdaEndpointInputProperty.Builder.() -> Unit):
        Unit = lambdaEndpoint(CfnService.LambdaEndpointInputProperty(lambdaEndpoint))

    /**
     * @param name The name of the service. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags assigned to the service.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the service.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param urlEndpoint The summary of the configuration for the URL endpoint type.
     */
    override fun urlEndpoint(urlEndpoint: IResolvable) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(IResolvable::unwrap))
    }

    /**
     * @param urlEndpoint The summary of the configuration for the URL endpoint type.
     */
    override fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty) {
      cdkBuilder.urlEndpoint(urlEndpoint.let(CfnService.UrlEndpointInputProperty::unwrap))
    }

    /**
     * @param urlEndpoint The summary of the configuration for the URL endpoint type.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17159304b0dec4c0b9633e5b97fb406060fcfea30e889bdb20021a6a468834b7")
    override fun urlEndpoint(urlEndpoint: CfnService.UrlEndpointInputProperty.Builder.() -> Unit):
        Unit = urlEndpoint(CfnService.UrlEndpointInputProperty(urlEndpoint))

    /**
     * @param vpcId The ID of the virtual private cloud (VPC).
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnServiceProps,
  ) : CdkObject(cdkObject), CfnServiceProps {
    /**
     * The unique identifier of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-applicationidentifier)
     */
    override fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

    /**
     * A description of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The endpoint type of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-endpointtype)
     */
    override fun endpointType(): String = unwrap(this).getEndpointType()

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-environmentidentifier)
     */
    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    /**
     * A summary of the configuration for the AWS Lambda endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-lambdaendpoint)
     */
    override fun lambdaEndpoint(): Any? = unwrap(this).getLambdaEndpoint()

    /**
     * The name of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags assigned to the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The summary of the configuration for the URL endpoint type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-urlendpoint)
     */
    override fun urlEndpoint(): Any? = unwrap(this).getUrlEndpoint()

    /**
     * The ID of the virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html#cfn-refactorspaces-service-vpcid)
     */
    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnServiceProps):
        CfnServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProps):
        software.amazon.awscdk.services.refactorspaces.CfnServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnServiceProps
  }
}
