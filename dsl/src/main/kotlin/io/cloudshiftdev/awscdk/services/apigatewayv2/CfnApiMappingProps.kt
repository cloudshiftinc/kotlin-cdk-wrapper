package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnApiMappingProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apiid)
   */
  public fun apiId(): String

  /**
   * The API mapping key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apimappingkey)
   */
  public fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

  /**
   * The domain name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-domainname)
   */
  public fun domainName(): String

  /**
   * The API stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-stage)
   */
  public fun stage(): String

  /**
   * A builder for [CfnApiMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param apiMappingKey The API mapping key.
     */
    public fun apiMappingKey(apiMappingKey: String)

    /**
     * @param domainName The domain name. 
     */
    public fun domainName(domainName: String)

    /**
     * @param stage The API stage. 
     */
    public fun stage(stage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param apiMappingKey The API mapping key.
     */
    override fun apiMappingKey(apiMappingKey: String) {
      cdkBuilder.apiMappingKey(apiMappingKey)
    }

    /**
     * @param domainName The domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param stage The API stage. 
     */
    override fun stage(stage: String) {
      cdkBuilder.stage(stage)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps,
  ) : CdkObject(cdkObject), CfnApiMappingProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The API mapping key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-apimappingkey)
     */
    override fun apiMappingKey(): String? = unwrap(this).getApiMappingKey()

    /**
     * The domain name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-domainname)
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apimapping.html#cfn-apigatewayv2-apimapping-stage)
     */
    override fun stage(): String = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps):
        CfnApiMappingProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiMappingProps):
        software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
  }
}
