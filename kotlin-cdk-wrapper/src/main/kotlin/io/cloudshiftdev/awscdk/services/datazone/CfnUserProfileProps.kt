@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnUserProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datazone.*;
 * CfnUserProfileProps cfnUserProfileProps = CfnUserProfileProps.builder()
 * .domainIdentifier("domainIdentifier")
 * .userIdentifier("userIdentifier")
 * // the properties below are optional
 * .status("status")
 * .userType("userType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html)
 */
public interface CfnUserProfileProps {
  /**
   * The identifier of a Amazon DataZone domain in which a user profile exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-domainidentifier)
   */
  public fun domainIdentifier(): String

  /**
   * The status of the user profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * The identifier of the user for which the user profile is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-useridentifier)
   */
  public fun userIdentifier(): String

  /**
   * The user type of the user for which the user profile is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-usertype)
   */
  public fun userType(): String? = unwrap(this).getUserType()

  /**
   * A builder for [CfnUserProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain in which a user profile
     * exists. 
     */
    public fun domainIdentifier(domainIdentifier: String)

    /**
     * @param status The status of the user profile.
     */
    public fun status(status: String)

    /**
     * @param userIdentifier The identifier of the user for which the user profile is created. 
     */
    public fun userIdentifier(userIdentifier: String)

    /**
     * @param userType The user type of the user for which the user profile is created.
     */
    public fun userType(userType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnUserProfileProps.Builder =
        software.amazon.awscdk.services.datazone.CfnUserProfileProps.builder()

    /**
     * @param domainIdentifier The identifier of a Amazon DataZone domain in which a user profile
     * exists. 
     */
    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    /**
     * @param status The status of the user profile.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param userIdentifier The identifier of the user for which the user profile is created. 
     */
    override fun userIdentifier(userIdentifier: String) {
      cdkBuilder.userIdentifier(userIdentifier)
    }

    /**
     * @param userType The user type of the user for which the user profile is created.
     */
    override fun userType(userType: String) {
      cdkBuilder.userType(userType)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnUserProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfileProps,
  ) : CdkObject(cdkObject),
      CfnUserProfileProps {
    /**
     * The identifier of a Amazon DataZone domain in which a user profile exists.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-domainidentifier)
     */
    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    /**
     * The status of the user profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * The identifier of the user for which the user profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-useridentifier)
     */
    override fun userIdentifier(): String = unwrap(this).getUserIdentifier()

    /**
     * The user type of the user for which the user profile is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datazone-userprofile.html#cfn-datazone-userprofile-usertype)
     */
    override fun userType(): String? = unwrap(this).getUserType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnUserProfileProps):
        CfnUserProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnUserProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfileProps):
        software.amazon.awscdk.services.datazone.CfnUserProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnUserProfileProps
  }
}
