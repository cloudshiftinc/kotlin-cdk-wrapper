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

public interface CfnApplicationProps {
  /**
   * The endpoint URL of the Amazon API Gateway proxy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
   */
  public fun apiGatewayProxy(): Any? = unwrap(this).getApiGatewayProxy()

  /**
   * The unique identifier of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-environmentidentifier)
   */
  public fun environmentIdentifier(): String

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-name)
   */
  public fun name(): String

  /**
   * The proxy type of the proxy created within the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-proxytype)
   */
  public fun proxyType(): String

  /**
   * The tags assigned to the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the virtual private cloud (VPC).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy.
     */
    public fun apiGatewayProxy(apiGatewayProxy: IResolvable)

    /**
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy.
     */
    public fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty)

    /**
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ab2d87ba722594bc608bca8b492170a176475dde75c1973cbde387d90d28fe")
    public
        fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty.Builder.() -> Unit)

    /**
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    public fun environmentIdentifier(environmentIdentifier: String)

    /**
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * @param proxyType The proxy type of the proxy created within the application. 
     */
    public fun proxyType(proxyType: String)

    /**
     * @param tags The tags assigned to the application.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the application.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the virtual private cloud (VPC). 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.refactorspaces.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnApplicationProps.builder()

    /**
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy.
     */
    override fun apiGatewayProxy(apiGatewayProxy: IResolvable) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(IResolvable::unwrap))
    }

    /**
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy.
     */
    override fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty) {
      cdkBuilder.apiGatewayProxy(apiGatewayProxy.let(CfnApplication.ApiGatewayProxyInputProperty::unwrap))
    }

    /**
     * @param apiGatewayProxy The endpoint URL of the Amazon API Gateway proxy.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ab2d87ba722594bc608bca8b492170a176475dde75c1973cbde387d90d28fe")
    override
        fun apiGatewayProxy(apiGatewayProxy: CfnApplication.ApiGatewayProxyInputProperty.Builder.() -> Unit):
        Unit = apiGatewayProxy(CfnApplication.ApiGatewayProxyInputProperty(apiGatewayProxy))

    /**
     * @param environmentIdentifier The unique identifier of the environment. 
     */
    override fun environmentIdentifier(environmentIdentifier: String) {
      cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    /**
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param proxyType The proxy type of the proxy created within the application. 
     */
    override fun proxyType(proxyType: String) {
      cdkBuilder.proxyType(proxyType)
    }

    /**
     * @param tags The tags assigned to the application.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the application.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the virtual private cloud (VPC). 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * The endpoint URL of the Amazon API Gateway proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-apigatewayproxy)
     */
    override fun apiGatewayProxy(): Any? = unwrap(this).getApiGatewayProxy()

    /**
     * The unique identifier of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-environmentidentifier)
     */
    override fun environmentIdentifier(): String = unwrap(this).getEnvironmentIdentifier()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The proxy type of the proxy created within the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-proxytype)
     */
    override fun proxyType(): String = unwrap(this).getProxyType()

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the virtual private cloud (VPC).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html#cfn-refactorspaces-application-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.refactorspaces.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnApplicationProps
  }
}
