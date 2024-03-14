package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the function. For example:.
   *
   * `arn:aws:cloudfront::123456789012:function/ExampleFunction` .
   *
   * To get the function ARN, use the following syntax:
   *
   * `!GetAtt *Function_Logical_ID* .FunctionMetadata.FunctionARN`
   */
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  /**
   * The Amazon Resource Name (ARN) of the function.
   *
   * The ARN uniquely identifies the function.
   */
  public open fun attrFunctionMetadataFunctionArn(): String =
      unwrap(this).getAttrFunctionMetadataFunctionArn()

  /**
   *
   */
  public open fun attrStage(): String = unwrap(this).getAttrStage()

  /**
   * A flag that determines whether to automatically publish the function to the `LIVE` stage when
   * it’s created.
   */
  public open fun autoPublish(): Any? = unwrap(this).getAutoPublish()

  /**
   * A flag that determines whether to automatically publish the function to the `LIVE` stage when
   * it’s created.
   */
  public open fun autoPublish(`value`: Boolean) {
    unwrap(this).setAutoPublish(`value`)
  }

  /**
   * A flag that determines whether to automatically publish the function to the `LIVE` stage when
   * it’s created.
   */
  public open fun autoPublish(`value`: IResolvable) {
    unwrap(this).setAutoPublish(`value`.let(IResolvable::unwrap))
  }

  /**
   * The function code.
   */
  public open fun functionCode(): String = unwrap(this).getFunctionCode()

  /**
   * The function code.
   */
  public open fun functionCode(`value`: String) {
    unwrap(this).setFunctionCode(`value`)
  }

  /**
   * Contains configuration information about a CloudFront function.
   */
  public open fun functionConfig(): Any = unwrap(this).getFunctionConfig()

  /**
   * Contains configuration information about a CloudFront function.
   */
  public open fun functionConfig(`value`: IResolvable) {
    unwrap(this).setFunctionConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains configuration information about a CloudFront function.
   */
  public open fun functionConfig(`value`: FunctionConfigProperty) {
    unwrap(this).setFunctionConfig(`value`.let(FunctionConfigProperty::unwrap))
  }

  /**
   * Contains configuration information about a CloudFront function.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d912ed670a3ed0b41b0337bba5deb4a03a5b2a78d72502f6996ffa6e761d20ca")
  public open fun functionConfig(`value`: FunctionConfigProperty.Builder.() -> Unit): Unit =
      functionConfig(FunctionConfigProperty(`value`))

  /**
   * Contains metadata about a CloudFront function.
   */
  public open fun functionMetadata(): Any? = unwrap(this).getFunctionMetadata()

  /**
   * Contains metadata about a CloudFront function.
   */
  public open fun functionMetadata(`value`: IResolvable) {
    unwrap(this).setFunctionMetadata(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains metadata about a CloudFront function.
   */
  public open fun functionMetadata(`value`: FunctionMetadataProperty) {
    unwrap(this).setFunctionMetadata(`value`.let(FunctionMetadataProperty::unwrap))
  }

  /**
   * Contains metadata about a CloudFront function.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c649f2b311bf6e070d9e89c5aaf1ca59c8567f1f17657c5cd93b5a8a0cb18ea1")
  public open fun functionMetadata(`value`: FunctionMetadataProperty.Builder.() -> Unit): Unit =
      functionMetadata(FunctionMetadataProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A name to identify the function.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name to identify the function.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CfnFunction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created. 
     */
    public fun autoPublish(autoPublish: Boolean)

    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created. 
     */
    public fun autoPublish(autoPublish: IResolvable)

    /**
     * The function code.
     *
     * For more information about writing a CloudFront function, see [Writing function code for
     * CloudFront
     * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functioncode)
     * @param functionCode The function code. 
     */
    public fun functionCode(functionCode: String)

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    public fun functionConfig(functionConfig: IResolvable)

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    public fun functionConfig(functionConfig: FunctionConfigProperty)

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fce6d74021529b7d490dff859dc0036e222c115069813d8f548ff68f74b843bc")
    public fun functionConfig(functionConfig: FunctionConfigProperty.Builder.() -> Unit)

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     * @param functionMetadata Contains metadata about a CloudFront function. 
     */
    public fun functionMetadata(functionMetadata: IResolvable)

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     * @param functionMetadata Contains metadata about a CloudFront function. 
     */
    public fun functionMetadata(functionMetadata: FunctionMetadataProperty)

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     * @param functionMetadata Contains metadata about a CloudFront function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d795f119cc42115758eadb9d3fbc68e16bd1a5de441d59689f44259f847f0d41")
    public fun functionMetadata(functionMetadata: FunctionMetadataProperty.Builder.() -> Unit)

    /**
     * A name to identify the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-name)
     * @param name A name to identify the function. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnFunction.Builder =
        software.amazon.awscdk.services.cloudfront.CfnFunction.Builder.create(scope, id)

    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created. 
     */
    override fun autoPublish(autoPublish: Boolean) {
      cdkBuilder.autoPublish(autoPublish)
    }

    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     * @param autoPublish A flag that determines whether to automatically publish the function to
     * the `LIVE` stage when it’s created. 
     */
    override fun autoPublish(autoPublish: IResolvable) {
      cdkBuilder.autoPublish(autoPublish.let(IResolvable::unwrap))
    }

    /**
     * The function code.
     *
     * For more information about writing a CloudFront function, see [Writing function code for
     * CloudFront
     * Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functioncode)
     * @param functionCode The function code. 
     */
    override fun functionCode(functionCode: String) {
      cdkBuilder.functionCode(functionCode)
    }

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    override fun functionConfig(functionConfig: IResolvable) {
      cdkBuilder.functionConfig(functionConfig.let(IResolvable::unwrap))
    }

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    override fun functionConfig(functionConfig: FunctionConfigProperty) {
      cdkBuilder.functionConfig(functionConfig.let(FunctionConfigProperty::unwrap))
    }

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     * @param functionConfig Contains configuration information about a CloudFront function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fce6d74021529b7d490dff859dc0036e222c115069813d8f548ff68f74b843bc")
    override fun functionConfig(functionConfig: FunctionConfigProperty.Builder.() -> Unit): Unit =
        functionConfig(FunctionConfigProperty(functionConfig))

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     * @param functionMetadata Contains metadata about a CloudFront function. 
     */
    override fun functionMetadata(functionMetadata: IResolvable) {
      cdkBuilder.functionMetadata(functionMetadata.let(IResolvable::unwrap))
    }

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     * @param functionMetadata Contains metadata about a CloudFront function. 
     */
    override fun functionMetadata(functionMetadata: FunctionMetadataProperty) {
      cdkBuilder.functionMetadata(functionMetadata.let(FunctionMetadataProperty::unwrap))
    }

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     * @param functionMetadata Contains metadata about a CloudFront function. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d795f119cc42115758eadb9d3fbc68e16bd1a5de441d59689f44259f847f0d41")
    override fun functionMetadata(functionMetadata: FunctionMetadataProperty.Builder.() -> Unit):
        Unit = functionMetadata(FunctionMetadataProperty(functionMetadata))

    /**
     * A name to identify the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-name)
     * @param name A name to identify the function. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnFunction = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction):
        CfnFunction = CfnFunction(cdkObject)

    internal fun unwrap(wrapped: CfnFunction):
        software.amazon.awscdk.services.cloudfront.CfnFunction = wrapped.cdkObject
  }

  public interface FunctionMetadataProperty {
    /**
     * The Amazon Resource Name (ARN) of the function.
     *
     * The ARN uniquely identifies the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionmetadata.html#cfn-cloudfront-function-functionmetadata-functionarn)
     */
    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    /**
     * A builder for [FunctionMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param functionArn The Amazon Resource Name (ARN) of the function.
       * The ARN uniquely identifies the function.
       */
      public fun functionArn(functionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty.builder()

      /**
       * @param functionArn The Amazon Resource Name (ARN) of the function.
       * The ARN uniquely identifies the function.
       */
      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty,
    ) : FunctionMetadataProperty {
      /**
       * The Amazon Resource Name (ARN) of the function.
       *
       * The ARN uniquely identifies the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionmetadata.html#cfn-cloudfront-function-functionmetadata-functionarn)
       */
      override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty):
          FunctionMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionMetadataProperty):
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FunctionConfigProperty {
    /**
     * A comment to describe the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html#cfn-cloudfront-function-functionconfig-comment)
     */
    public fun comment(): String

    /**
     * The configuration for the key value store associations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html#cfn-cloudfront-function-functionconfig-keyvaluestoreassociations)
     */
    public fun keyValueStoreAssociations(): Any? = unwrap(this).getKeyValueStoreAssociations()

    /**
     * The function's runtime environment version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html#cfn-cloudfront-function-functionconfig-runtime)
     */
    public fun runtime(): String

    /**
     * A builder for [FunctionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A comment to describe the function. 
       */
      public fun comment(comment: String)

      /**
       * @param keyValueStoreAssociations The configuration for the key value store associations.
       */
      public fun keyValueStoreAssociations(keyValueStoreAssociations: IResolvable)

      /**
       * @param keyValueStoreAssociations The configuration for the key value store associations.
       */
      public fun keyValueStoreAssociations(keyValueStoreAssociations: List<Any>)

      /**
       * @param keyValueStoreAssociations The configuration for the key value store associations.
       */
      public fun keyValueStoreAssociations(vararg keyValueStoreAssociations: Any)

      /**
       * @param runtime The function's runtime environment version. 
       */
      public fun runtime(runtime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty.builder()

      /**
       * @param comment A comment to describe the function. 
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param keyValueStoreAssociations The configuration for the key value store associations.
       */
      override fun keyValueStoreAssociations(keyValueStoreAssociations: IResolvable) {
        cdkBuilder.keyValueStoreAssociations(keyValueStoreAssociations.let(IResolvable::unwrap))
      }

      /**
       * @param keyValueStoreAssociations The configuration for the key value store associations.
       */
      override fun keyValueStoreAssociations(keyValueStoreAssociations: List<Any>) {
        cdkBuilder.keyValueStoreAssociations(keyValueStoreAssociations)
      }

      /**
       * @param keyValueStoreAssociations The configuration for the key value store associations.
       */
      override fun keyValueStoreAssociations(vararg keyValueStoreAssociations: Any): Unit =
          keyValueStoreAssociations(keyValueStoreAssociations.toList())

      /**
       * @param runtime The function's runtime environment version. 
       */
      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty,
    ) : FunctionConfigProperty {
      /**
       * A comment to describe the function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html#cfn-cloudfront-function-functionconfig-comment)
       */
      override fun comment(): String = unwrap(this).getComment()

      /**
       * The configuration for the key value store associations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html#cfn-cloudfront-function-functionconfig-keyvaluestoreassociations)
       */
      override fun keyValueStoreAssociations(): Any? = unwrap(this).getKeyValueStoreAssociations()

      /**
       * The function's runtime environment version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html#cfn-cloudfront-function-functionconfig-runtime)
       */
      override fun runtime(): String = unwrap(this).getRuntime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty):
          FunctionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KeyValueStoreAssociationProperty {
    /**
     * The Amazon Resource Name (ARN) of the key value store association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-keyvaluestoreassociation.html#cfn-cloudfront-function-keyvaluestoreassociation-keyvaluestorearn)
     */
    public fun keyValueStoreArn(): String

    /**
     * A builder for [KeyValueStoreAssociationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param keyValueStoreArn The Amazon Resource Name (ARN) of the key value store association. 
       */
      public fun keyValueStoreArn(keyValueStoreArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty.builder()

      /**
       * @param keyValueStoreArn The Amazon Resource Name (ARN) of the key value store association. 
       */
      override fun keyValueStoreArn(keyValueStoreArn: String) {
        cdkBuilder.keyValueStoreArn(keyValueStoreArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty,
    ) : KeyValueStoreAssociationProperty {
      /**
       * The Amazon Resource Name (ARN) of the key value store association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-keyvaluestoreassociation.html#cfn-cloudfront-function-keyvaluestoreassociation-keyvaluestorearn)
       */
      override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueStoreAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty):
          KeyValueStoreAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueStoreAssociationProperty):
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
