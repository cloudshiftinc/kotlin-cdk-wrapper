package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApp internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The name of the app.
   */
  public open fun appName(): String = unwrap(this).getAppName()

  /**
   * The name of the app.
   */
  public open fun appName(`value`: String) {
    unwrap(this).setAppName(`value`)
  }

  /**
   * The type of app.
   */
  public open fun appType(): String = unwrap(this).getAppType()

  /**
   * The type of app.
   */
  public open fun appType(`value`: String) {
    unwrap(this).setAppType(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the app, such as
   * `arn:aws:sagemaker:us-west-2:account-id:app/my-app-name` .
   */
  public open fun attrAppArn(): String = unwrap(this).getAttrAppArn()

  /**
   * The domain ID.
   */
  public open fun domainId(): String = unwrap(this).getDomainId()

  /**
   * The domain ID.
   */
  public open fun domainId(`value`: String) {
    unwrap(this).setDomainId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type that
   * the version runs on.
   */
  public open fun resourceSpec(): Any? = unwrap(this).getResourceSpec()

  /**
   * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type that
   * the version runs on.
   */
  public open fun resourceSpec(`value`: IResolvable) {
    unwrap(this).setResourceSpec(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type that
   * the version runs on.
   */
  public open fun resourceSpec(`value`: ResourceSpecProperty) {
    unwrap(this).setResourceSpec(`value`.let(ResourceSpecProperty::unwrap))
  }

  /**
   * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type that
   * the version runs on.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd3f84f609c93f64bc688d5d5769c61da6d219d0d770f5ebaea1efb0bec2b395")
  public open fun resourceSpec(`value`: ResourceSpecProperty.Builder.() -> Unit): Unit =
      resourceSpec(ResourceSpecProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The user profile name.
   */
  public open fun userProfileName(): String = unwrap(this).getUserProfileName()

  /**
   * The user profile name.
   */
  public open fun userProfileName(`value`: String) {
    unwrap(this).setUserProfileName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnApp].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-appname)
     * @param appName The name of the app. 
     */
    public fun appName(appName: String)

    /**
     * The type of app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-apptype)
     * @param appType The type of app. 
     */
    public fun appType(appType: String)

    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-domainid)
     * @param domainId The domain ID. 
     */
    public fun domainId(domainId: String)

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on. 
     */
    public fun resourceSpec(resourceSpec: IResolvable)

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on. 
     */
    public fun resourceSpec(resourceSpec: ResourceSpecProperty)

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a18d0d61a4fd4339ee80ec6475c78192cc13cedd2ffb51653e34e42b651554")
    public fun resourceSpec(resourceSpec: ResourceSpecProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-userprofilename)
     * @param userProfileName The user profile name. 
     */
    public fun userProfileName(userProfileName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnApp.Builder =
        software.amazon.awscdk.services.sagemaker.CfnApp.Builder.create(scope, id)

    /**
     * The name of the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-appname)
     * @param appName The name of the app. 
     */
    override fun appName(appName: String) {
      cdkBuilder.appName(appName)
    }

    /**
     * The type of app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-apptype)
     * @param appType The type of app. 
     */
    override fun appType(appType: String) {
      cdkBuilder.appType(appType)
    }

    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-domainid)
     * @param domainId The domain ID. 
     */
    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on. 
     */
    override fun resourceSpec(resourceSpec: IResolvable) {
      cdkBuilder.resourceSpec(resourceSpec.let(IResolvable::unwrap))
    }

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on. 
     */
    override fun resourceSpec(resourceSpec: ResourceSpecProperty) {
      cdkBuilder.resourceSpec(resourceSpec.let(ResourceSpecProperty::unwrap))
    }

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00a18d0d61a4fd4339ee80ec6475c78192cc13cedd2ffb51653e34e42b651554")
    override fun resourceSpec(resourceSpec: ResourceSpecProperty.Builder.() -> Unit): Unit =
        resourceSpec(ResourceSpecProperty(resourceSpec))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-userprofilename)
     * @param userProfileName The user profile name. 
     */
    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnApp = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApp {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApp(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp): CfnApp =
        CfnApp(cdkObject)

    internal fun unwrap(wrapped: CfnApp): software.amazon.awscdk.services.sagemaker.CfnApp =
        wrapped.cdkObject
  }

  public interface ResourceSpecProperty {
    /**
     * The instance type that the image version runs on.
     *
     *
     * *JupyterServer apps* only support the `system` value.
     *
     * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` . KernelGateway
     * apps also support all other values for available instance types.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html#cfn-sagemaker-app-resourcespec-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * The ARN of the SageMaker image that the image version belongs to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html#cfn-sagemaker-app-resourcespec-sagemakerimagearn)
     */
    public fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

    /**
     * The ARN of the image version created on the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html#cfn-sagemaker-app-resourcespec-sagemakerimageversionarn)
     */
    public fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()

    /**
     * A builder for [ResourceSpecProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instanceType The instance type that the image version runs on.
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       */
      public fun instanceType(instanceType: String)

      /**
       * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
       */
      public fun sageMakerImageArn(sageMakerImageArn: String)

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       */
      public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty.builder()

      /**
       * @param instanceType The instance type that the image version runs on.
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param sageMakerImageArn The ARN of the SageMaker image that the image version belongs to.
       */
      override fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
      }

      /**
       * @param sageMakerImageVersionArn The ARN of the image version created on the instance.
       */
      override fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
      }

      public fun build(): software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty,
    ) : CdkObject(cdkObject), ResourceSpecProperty {
      /**
       * The instance type that the image version runs on.
       *
       *
       * *JupyterServer apps* only support the `system` value.
       *
       * For *KernelGateway apps* , the `system` value is translated to `ml.t3.medium` .
       * KernelGateway apps also support all other values for available instance types.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html#cfn-sagemaker-app-resourcespec-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * The ARN of the SageMaker image that the image version belongs to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html#cfn-sagemaker-app-resourcespec-sagemakerimagearn)
       */
      override fun sageMakerImageArn(): String? = unwrap(this).getSageMakerImageArn()

      /**
       * The ARN of the image version created on the instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-app-resourcespec.html#cfn-sagemaker-app-resourcespec-sagemakerimageversionarn)
       */
      override fun sageMakerImageVersionArn(): String? = unwrap(this).getSageMakerImageVersionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty):
          ResourceSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSpecProperty):
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.sagemaker.CfnApp.ResourceSpecProperty
    }
  }
}