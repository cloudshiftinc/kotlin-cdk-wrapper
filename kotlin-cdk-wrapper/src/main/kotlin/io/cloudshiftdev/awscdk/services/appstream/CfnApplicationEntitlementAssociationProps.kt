@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnApplicationEntitlementAssociationProps {
  public fun applicationIdentifier(): String

  public fun entitlementName(): String

  public fun stackName(): String

  @CdkDslMarker
  public interface Builder {
    public fun applicationIdentifier(applicationIdentifier: String)

    public fun entitlementName(entitlementName: String)

    public fun stackName(stackName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps.Builder
        =
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps.builder()

    override fun applicationIdentifier(applicationIdentifier: String) {
      cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    override fun entitlementName(entitlementName: String) {
      cdkBuilder.entitlementName(entitlementName)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public fun build():
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps,
  ) : CdkObject(cdkObject), CfnApplicationEntitlementAssociationProps {
    override fun applicationIdentifier(): String = unwrap(this).getApplicationIdentifier()

    override fun entitlementName(): String = unwrap(this).getEntitlementName()

    override fun stackName(): String = unwrap(this).getStackName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnApplicationEntitlementAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps):
        CfnApplicationEntitlementAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationEntitlementAssociationProps):
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps
  }
}
