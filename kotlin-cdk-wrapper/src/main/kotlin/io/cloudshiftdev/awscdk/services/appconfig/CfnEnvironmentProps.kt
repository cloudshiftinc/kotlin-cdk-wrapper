@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .applicationId("applicationId")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .monitors(List.of(MonitorsProperty.builder()
 * .alarmArn("alarmArn")
 * .alarmRoleArn("alarmRoleArn")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html)
 */
public interface CfnEnvironmentProps {
  /**
   * The application ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-applicationid)
   */
  public fun applicationId(): String

  /**
   * A description of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Amazon CloudWatch alarms to monitor during the deployment process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
   */
  public fun monitors(): Any? = unwrap(this).getMonitors()

  /**
   * A name for the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-name)
   */
  public fun name(): String

  /**
   * Metadata to assign to the environment.
   *
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The application ID. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param description A description of the environment.
     */
    public fun description(description: String)

    /**
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process.
     */
    public fun monitors(monitors: IResolvable)

    /**
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process.
     */
    public fun monitors(monitors: List<Any>)

    /**
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process.
     */
    public fun monitors(vararg monitors: Any)

    /**
     * @param name A name for the environment. 
     */
    public fun name(name: String)

    /**
     * @param tags Metadata to assign to the environment.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata to assign to the environment.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.appconfig.CfnEnvironmentProps.builder()

    /**
     * @param applicationId The application ID. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param description A description of the environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process.
     */
    override fun monitors(monitors: IResolvable) {
      cdkBuilder.monitors(monitors.let(IResolvable::unwrap))
    }

    /**
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process.
     */
    override fun monitors(monitors: List<Any>) {
      cdkBuilder.monitors(monitors)
    }

    /**
     * @param monitors Amazon CloudWatch alarms to monitor during the deployment process.
     */
    override fun monitors(vararg monitors: Any): Unit = monitors(monitors.toList())

    /**
     * @param name A name for the environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Metadata to assign to the environment.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata to assign to the environment.
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    /**
     * The application ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Amazon CloudWatch alarms to monitor during the deployment process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-monitors)
     */
    override fun monitors(): Any? = unwrap(this).getMonitors()

    /**
     * A name for the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Metadata to assign to the environment.
     *
     * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key
     * and an optional value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-environment.html#cfn-appconfig-environment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.appconfig.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.CfnEnvironmentProps
  }
}
