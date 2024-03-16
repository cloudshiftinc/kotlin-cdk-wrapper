@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnViewVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnViewVersionProps cfnViewVersionProps = CfnViewVersionProps.builder()
 * .viewArn("viewArn")
 * // the properties below are optional
 * .versionDescription("versionDescription")
 * .viewContentSha256("viewContentSha256")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html)
 */
public interface CfnViewVersionProps {
  /**
   * The description of the view version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-versiondescription)
   */
  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  /**
   * The unqualified Amazon Resource Name (ARN) of the view.
   *
   * For example:
   *
   * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewarn)
   */
  public fun viewArn(): String

  /**
   * Indicates the checksum value of the latest published view content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewcontentsha256)
   */
  public fun viewContentSha256(): String? = unwrap(this).getViewContentSha256()

  /**
   * A builder for [CfnViewVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param versionDescription The description of the view version.
     */
    public fun versionDescription(versionDescription: String)

    /**
     * @param viewArn The unqualified Amazon Resource Name (ARN) of the view. 
     * For example:
     *
     * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
     */
    public fun viewArn(viewArn: String)

    /**
     * @param viewContentSha256 Indicates the checksum value of the latest published view content.
     */
    public fun viewContentSha256(viewContentSha256: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnViewVersionProps.Builder =
        software.amazon.awscdk.services.connect.CfnViewVersionProps.builder()

    /**
     * @param versionDescription The description of the view version.
     */
    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    /**
     * @param viewArn The unqualified Amazon Resource Name (ARN) of the view. 
     * For example:
     *
     * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
     */
    override fun viewArn(viewArn: String) {
      cdkBuilder.viewArn(viewArn)
    }

    /**
     * @param viewContentSha256 Indicates the checksum value of the latest published view content.
     */
    override fun viewContentSha256(viewContentSha256: String) {
      cdkBuilder.viewContentSha256(viewContentSha256)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnViewVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnViewVersionProps,
  ) : CdkObject(cdkObject), CfnViewVersionProps {
    /**
     * The description of the view version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-versiondescription)
     */
    override fun versionDescription(): String? = unwrap(this).getVersionDescription()

    /**
     * The unqualified Amazon Resource Name (ARN) of the view.
     *
     * For example:
     *
     * `arn:&lt;partition&gt;:connect:&lt;region&gt;:&lt;accountId&gt;:instance/00000000-0000-0000-0000-000000000000/view/00000000-0000-0000-0000-000000000000`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewarn)
     */
    override fun viewArn(): String = unwrap(this).getViewArn()

    /**
     * Indicates the checksum value of the latest published view content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-viewversion.html#cfn-connect-viewversion-viewcontentsha256)
     */
    override fun viewContentSha256(): String? = unwrap(this).getViewContentSha256()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnViewVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnViewVersionProps):
        CfnViewVersionProps = CdkObjectWrappers.wrap(cdkObject) as CfnViewVersionProps

    internal fun unwrap(wrapped: CfnViewVersionProps):
        software.amazon.awscdk.services.connect.CfnViewVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnViewVersionProps
  }
}
