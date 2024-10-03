@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleethub

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * import io.cloudshiftdev.awscdk.services.iotfleethub.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .applicationName("applicationName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .applicationDescription("applicationDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html)
 */
public interface CfnApplicationProps {
  /**
   * An optional description of the web application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationdescription)
   */
  public fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

  /**
   * The name of the web application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationname)
   */
  public fun applicationName(): String

  /**
   * The ARN of the role that the web application assumes when it interacts with AWS IoT Core .
   *
   *
   * The name of the role must be in the form `FleetHub_random_string` .
   *
   *
   * Pattern: `^arn:[!-~]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-rolearn)
   */
  public fun roleArn(): String

  /**
   * A set of key/value pairs that you can use to manage the web application resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationDescription An optional description of the web application.
     */
    public fun applicationDescription(applicationDescription: String)

    /**
     * @param applicationName The name of the web application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * @param roleArn The ARN of the role that the web application assumes when it interacts with
     * AWS IoT Core . 
     *
     * The name of the role must be in the form `FleetHub_random_string` .
     *
     *
     * Pattern: `^arn:[!-~]+$`
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleethub.CfnApplicationProps.Builder
        = software.amazon.awscdk.services.iotfleethub.CfnApplicationProps.builder()

    /**
     * @param applicationDescription An optional description of the web application.
     */
    override fun applicationDescription(applicationDescription: String) {
      cdkBuilder.applicationDescription(applicationDescription)
    }

    /**
     * @param applicationName The name of the web application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param roleArn The ARN of the role that the web application assumes when it interacts with
     * AWS IoT Core . 
     *
     * The name of the role must be in the form `FleetHub_random_string` .
     *
     *
     * Pattern: `^arn:[!-~]+$`
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A set of key/value pairs that you can use to manage the web application resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleethub.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotfleethub.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * An optional description of the web application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationdescription)
     */
    override fun applicationDescription(): String? = unwrap(this).getApplicationDescription()

    /**
     * The name of the web application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-applicationname)
     */
    override fun applicationName(): String = unwrap(this).getApplicationName()

    /**
     * The ARN of the role that the web application assumes when it interacts with AWS IoT Core .
     *
     *
     * The name of the role must be in the form `FleetHub_random_string` .
     *
     *
     * Pattern: `^arn:[!-~]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * A set of key/value pairs that you can use to manage the web application resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html#cfn-iotfleethub-application-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleethub.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.iotfleethub.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleethub.CfnApplicationProps
  }
}
