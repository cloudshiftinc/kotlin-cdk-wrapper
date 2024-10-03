@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.identitystore.*;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
 * .displayName("displayName")
 * .identityStoreId("identityStoreId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html)
 */
public interface CfnGroupProps {
  /**
   * A string containing the description of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name value for the group.
   *
   * The length limit is 1,024 characters. This value can consist of letters, accented characters,
   * symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in
   * this attribute. This value is specified at the time the group is created and stored as an
   * attribute of the group object in the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
   */
  public fun displayName(): String

  /**
   * The globally unique identifier for the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-identitystoreid)
   */
  public fun identityStoreId(): String

  /**
   * A builder for [CfnGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A string containing the description of the group.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name value for the group. 
     * The length limit is 1,024 characters. This value can consist of letters, accented characters,
     * symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in
     * this attribute. This value is specified at the time the group is created and stored as an
     * attribute of the group object in the identity store.
     */
    public fun displayName(displayName: String)

    /**
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    public fun identityStoreId(identityStoreId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.identitystore.CfnGroupProps.Builder =
        software.amazon.awscdk.services.identitystore.CfnGroupProps.builder()

    /**
     * @param description A string containing the description of the group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name value for the group. 
     * The length limit is 1,024 characters. This value can consist of letters, accented characters,
     * symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in
     * this attribute. This value is specified at the time the group is created and stored as an
     * attribute of the group object in the identity store.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupProps,
  ) : CdkObject(cdkObject),
      CfnGroupProps {
    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name value for the group.
     *
     * The length limit is 1,024 characters. This value can consist of letters, accented characters,
     * symbols, numbers, punctuation, tab, new line, carriage return, space, and nonbreaking space in
     * this attribute. This value is specified at the time the group is created and stored as an
     * attribute of the group object in the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * The globally unique identifier for the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-identitystoreid)
     */
    override fun identityStoreId(): String = unwrap(this).getIdentityStoreId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupProps):
        CfnGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.identitystore.CfnGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.identitystore.CfnGroupProps
  }
}
