@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGroupProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnGroupProfileProps cfnGroupProfileProps = CfnGroupProfileProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .groupIdentifier("groupIdentifier")
 * // the properties below are optional
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html)
 */
public interface CfnGroupProfileProps {
  /**
   * The identifier of the Amazon DataZone domain in which a group profile exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The ID of the group of a project member.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-groupidentifier)
   */
  public fun groupIdentifier(): String

  /**
   * The status of a group profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * A builder for [CfnGroupProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which a group profile
     * exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param groupIdentifier The ID of the group of a project member. 
     */
    public fun groupIdentifier(groupIdentifier: String)

    /**
     * @param status The status of a group profile.
     */
    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnGroupProfileProps.Builder =
        software.amazon.awscdk.services.datazone.CfnGroupProfileProps.builder()

    /**
     * @param domainIdentifier The identifier of the Amazon DataZone domain in which a group profile
     * exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param groupIdentifier The ID of the group of a project member. 
     */
    override fun groupIdentifier(groupIdentifier: String) {
      cdkBuilder.groupIdentifier(groupIdentifier)
    }

    /**
     * @param status The status of a group profile.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnGroupProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnGroupProfileProps,
  ) : CdkObject(cdkObject),
      CfnGroupProfileProps {
    /**
     * The identifier of the Amazon DataZone domain in which a group profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The ID of the group of a project member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-groupidentifier)
     */
    override fun groupIdentifier(): String = unwrap(this).getGroupIdentifier()

    /**
     * The status of a group profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-groupprofile.html#cfn-datazone-groupprofile-status)
     */
    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnGroupProfileProps):
        CfnGroupProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProfileProps):
        software.amazon.awscdk.services.datazone.CfnGroupProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnGroupProfileProps
  }
}
