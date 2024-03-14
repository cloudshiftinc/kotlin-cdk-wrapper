package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnGroupProps {
  /**
   * A string containing the description of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A string containing the name of the group.
   *
   * This value is commonly displayed when the group is referenced.
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
     * @param displayName A string containing the name of the group. 
     * This value is commonly displayed when the group is referenced.
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
     * @param displayName A string containing the name of the group. 
     * This value is commonly displayed when the group is referenced.
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
    override val cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    /**
     * A string containing the description of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-group.html#cfn-identitystore-group-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A string containing the name of the group.
     *
     * This value is commonly displayed when the group is referenced.
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
        CfnGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.identitystore.CfnGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.identitystore.CfnGroupProps
  }
}
