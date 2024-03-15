@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun displayName(): String

  public fun identityStoreId(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun identityStoreId(identityStoreId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.identitystore.CfnGroupProps.Builder =
        software.amazon.awscdk.services.identitystore.CfnGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun displayName(): String = unwrap(this).getDisplayName()

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
