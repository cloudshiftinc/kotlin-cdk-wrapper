@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationName("applicationName")
 * .computePlatform("computePlatform")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html)
 */
public interface CfnApplicationProps {
  /**
   * A name for the application.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the application name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * Updates to `ApplicationName` are not supported.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * The compute platform that CodeDeploy deploys the application to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
   */
  public fun computePlatform(): String? = unwrap(this).getComputePlatform()

  /**
   * The metadata that you apply to CodeDeploy applications to help you organize and categorize
   * them.
   *
   * Each tag consists of a key and an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName A name for the application.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * Updates to `ApplicationName` are not supported.
     */
    public fun applicationName(applicationName: String)

    /**
     * @param computePlatform The compute platform that CodeDeploy deploys the application to.
     */
    public fun computePlatform(computePlatform: String)

    /**
     * @param tags The metadata that you apply to CodeDeploy applications to help you organize and
     * categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to CodeDeploy applications to help you organize and
     * categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.codedeploy.CfnApplicationProps.builder()

    /**
     * @param applicationName A name for the application.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * Updates to `ApplicationName` are not supported.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param computePlatform The compute platform that CodeDeploy deploys the application to.
     */
    override fun computePlatform(computePlatform: String) {
      cdkBuilder.computePlatform(computePlatform)
    }

    /**
     * @param tags The metadata that you apply to CodeDeploy applications to help you organize and
     * categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to CodeDeploy applications to help you organize and
     * categorize them.
     * Each tag consists of a key and an optional value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codedeploy.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * A name for the application.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the application name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * Updates to `ApplicationName` are not supported.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-applicationname)
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()

    /**
     * The compute platform that CodeDeploy deploys the application to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-computeplatform)
     */
    override fun computePlatform(): String? = unwrap(this).getComputePlatform()

    /**
     * The metadata that you apply to CodeDeploy applications to help you organize and categorize
     * them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-application.html#cfn-codedeploy-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.codedeploy.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.CfnApplicationProps
  }
}
