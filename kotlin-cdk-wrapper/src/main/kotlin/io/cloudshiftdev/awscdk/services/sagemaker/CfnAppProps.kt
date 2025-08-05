@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApp`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnAppProps cfnAppProps = CfnAppProps.builder()
 * .appName("appName")
 * .appType("appType")
 * .domainId("domainId")
 * .userProfileName("userProfileName")
 * // the properties below are optional
 * .recoveryMode(false)
 * .resourceSpec(ResourceSpecProperty.builder()
 * .instanceType("instanceType")
 * .lifecycleConfigArn("lifecycleConfigArn")
 * .sageMakerImageArn("sageMakerImageArn")
 * .sageMakerImageVersionArn("sageMakerImageVersionArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html)
 */
public interface CfnAppProps {
  /**
   * The name of the app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-appname)
   */
  public fun appName(): String

  /**
   * The type of app.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-apptype)
   */
  public fun appType(): String

  /**
   * The domain ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-domainid)
   */
  public fun domainId(): String

  /**
   * Indicates whether the application is launched in recovery mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-recoverymode)
   */
  public fun recoveryMode(): Any? = unwrap(this).getRecoveryMode()

  /**
   * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type that
   * the version runs on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
   */
  public fun resourceSpec(): Any? = unwrap(this).getResourceSpec()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The user profile name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-userprofilename)
   */
  public fun userProfileName(): String

  /**
   * A builder for [CfnAppProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param appName The name of the app. 
     */
    public fun appName(appName: String)

    /**
     * @param appType The type of app. 
     */
    public fun appType(appType: String)

    /**
     * @param domainId The domain ID. 
     */
    public fun domainId(domainId: String)

    /**
     * @param recoveryMode Indicates whether the application is launched in recovery mode.
     */
    public fun recoveryMode(recoveryMode: Boolean)

    /**
     * @param recoveryMode Indicates whether the application is launched in recovery mode.
     */
    public fun recoveryMode(recoveryMode: IResolvable)

    /**
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on.
     */
    public fun resourceSpec(resourceSpec: IResolvable)

    /**
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on.
     */
    public fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty)

    /**
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbdeb98175f36b3fc2883b11bb47a6dd065e723ce826b7b7dfd3d77207c8909b")
    public fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userProfileName The user profile name. 
     */
    public fun userProfileName(userProfileName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnAppProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnAppProps.builder()

    /**
     * @param appName The name of the app. 
     */
    override fun appName(appName: String) {
      cdkBuilder.appName(appName)
    }

    /**
     * @param appType The type of app. 
     */
    override fun appType(appType: String) {
      cdkBuilder.appType(appType)
    }

    /**
     * @param domainId The domain ID. 
     */
    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    /**
     * @param recoveryMode Indicates whether the application is launched in recovery mode.
     */
    override fun recoveryMode(recoveryMode: Boolean) {
      cdkBuilder.recoveryMode(recoveryMode)
    }

    /**
     * @param recoveryMode Indicates whether the application is launched in recovery mode.
     */
    override fun recoveryMode(recoveryMode: IResolvable) {
      cdkBuilder.recoveryMode(recoveryMode.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on.
     */
    override fun resourceSpec(resourceSpec: IResolvable) {
      cdkBuilder.resourceSpec(resourceSpec.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on.
     */
    override fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty) {
      cdkBuilder.resourceSpec(resourceSpec.let(CfnApp.ResourceSpecProperty.Companion::unwrap))
    }

    /**
     * @param resourceSpec Specifies the ARNs of a SageMaker image and SageMaker image version, and
     * the instance type that the version runs on.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbdeb98175f36b3fc2883b11bb47a6dd065e723ce826b7b7dfd3d77207c8909b")
    override fun resourceSpec(resourceSpec: CfnApp.ResourceSpecProperty.Builder.() -> Unit): Unit =
        resourceSpec(CfnApp.ResourceSpecProperty(resourceSpec))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userProfileName The user profile name. 
     */
    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnAppProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppProps,
  ) : CdkObject(cdkObject),
      CfnAppProps {
    /**
     * The name of the app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-appname)
     */
    override fun appName(): String = unwrap(this).getAppName()

    /**
     * The type of app.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-apptype)
     */
    override fun appType(): String = unwrap(this).getAppType()

    /**
     * The domain ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-domainid)
     */
    override fun domainId(): String = unwrap(this).getDomainId()

    /**
     * Indicates whether the application is launched in recovery mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-recoverymode)
     */
    override fun recoveryMode(): Any? = unwrap(this).getRecoveryMode()

    /**
     * Specifies the ARNs of a SageMaker image and SageMaker image version, and the instance type
     * that the version runs on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-resourcespec)
     */
    override fun resourceSpec(): Any? = unwrap(this).getResourceSpec()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The user profile name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-app.html#cfn-sagemaker-app-userprofilename)
     */
    override fun userProfileName(): String = unwrap(this).getUserProfileName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAppProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnAppProps): CfnAppProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnAppProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAppProps): software.amazon.awscdk.services.sagemaker.CfnAppProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnAppProps
  }
}
