@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnUserToGroupAdditionProps {
  public fun groupName(): String

  public fun users(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun groupName(groupName: String)

    public fun users(users: List<String>)

    public fun users(vararg users: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps.Builder
        = software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps.builder()

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps,
  ) : CdkObject(cdkObject), CfnUserToGroupAdditionProps {
    override fun groupName(): String = unwrap(this).getGroupName()

    override fun users(): List<String> = unwrap(this).getUsers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserToGroupAdditionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps):
        CfnUserToGroupAdditionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserToGroupAdditionProps):
        software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUserToGroupAdditionProps
  }
}
