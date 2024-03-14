package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFunctionProps {
  /**
   * A flag that determines whether to automatically publish the function to the `LIVE` stage when
   * it’s created.
   *
   * To automatically publish to the `LIVE` stage, set this property to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
   */
  public fun autoPublish(): Any? = unwrap(this).getAutoPublish()

  /**
   * The function code.
   *
   * For more information about writing a CloudFront function, see [Writing function code for
   * CloudFront
   * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
   * in the *Amazon CloudFront Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functioncode)
   */
  public fun functionCode(): String

  /**
   * Contains configuration information about a CloudFront function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
   */
  public fun functionConfig(): Any

  /**
   * Contains metadata about a CloudFront function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
   */
  public fun functionMetadata(): Any? = unwrap(this).getFunctionMetadata()

  /**
   * A name to identify the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnFunctionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created.
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     */
    public fun autoPublish(autoPublish: Boolean)

    /**
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created.
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     */
    public fun autoPublish(autoPublish: IResolvable)

    /**
     * @param functionCode The function code. 
     * For more information about writing a CloudFront function, see [Writing function code for
     * CloudFront
     * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun functionCode(functionCode: String)

    /**
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    public fun functionConfig(functionConfig: IResolvable)

    /**
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty)

    /**
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf836aa1432e8ae186b892d4d11c27da62ccda66f6b8ed59feca83059031fa5")
    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty.Builder.() -> Unit)

    /**
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    public fun functionMetadata(functionMetadata: IResolvable)

    /**
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty)

    /**
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c70be04fb52a1846f7d7c8f7b5681da95a5df0066b40b9daa89f31a44ae89b")
    public
        fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty.Builder.() -> Unit)

    /**
     * @param name A name to identify the function. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnFunctionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnFunctionProps.builder()

    /**
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created.
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     */
    override fun autoPublish(autoPublish: Boolean) {
      cdkBuilder.autoPublish(autoPublish)
    }

    /**
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created.
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     */
    override fun autoPublish(autoPublish: IResolvable) {
      cdkBuilder.autoPublish(autoPublish.let(IResolvable::unwrap))
    }

    /**
     * @param functionCode The function code. 
     * For more information about writing a CloudFront function, see [Writing function code for
     * CloudFront
     * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    override fun functionCode(functionCode: String) {
      cdkBuilder.functionCode(functionCode)
    }

    /**
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    override fun functionConfig(functionConfig: IResolvable) {
      cdkBuilder.functionConfig(functionConfig.let(IResolvable::unwrap))
    }

    /**
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    override fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
      cdkBuilder.functionConfig(functionConfig.let(CfnFunction.FunctionConfigProperty::unwrap))
    }

    /**
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf836aa1432e8ae186b892d4d11c27da62ccda66f6b8ed59feca83059031fa5")
    override
        fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty.Builder.() -> Unit):
        Unit = functionConfig(CfnFunction.FunctionConfigProperty(functionConfig))

    /**
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    override fun functionMetadata(functionMetadata: IResolvable) {
      cdkBuilder.functionMetadata(functionMetadata.let(IResolvable::unwrap))
    }

    /**
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    override fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
      cdkBuilder.functionMetadata(functionMetadata.let(CfnFunction.FunctionMetadataProperty::unwrap))
    }

    /**
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c70be04fb52a1846f7d7c8f7b5681da95a5df0066b40b9daa89f31a44ae89b")
    override
        fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty.Builder.() -> Unit):
        Unit = functionMetadata(CfnFunction.FunctionMetadataProperty(functionMetadata))

    /**
     * @param name A name to identify the function. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnFunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunctionProps,
  ) : CdkObject(cdkObject), CfnFunctionProps {
    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     */
    override fun autoPublish(): Any? = unwrap(this).getAutoPublish()

    /**
     * The function code.
     *
     * For more information about writing a CloudFront function, see [Writing function code for
     * CloudFront
     * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functioncode)
     */
    override fun functionCode(): String = unwrap(this).getFunctionCode()

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     */
    override fun functionConfig(): Any = unwrap(this).getFunctionConfig()

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     */
    override fun functionMetadata(): Any? = unwrap(this).getFunctionMetadata()

    /**
     * A name to identify the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunctionProps):
        CfnFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionProps):
        software.amazon.awscdk.services.cloudfront.CfnFunctionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnFunctionProps
  }
}
