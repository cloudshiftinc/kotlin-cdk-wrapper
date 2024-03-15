@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSnapshotBlockPublicAccess internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun state(): String = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun state(state: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess.Builder
        = software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess.Builder.create(scope, id)

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSnapshotBlockPublicAccess {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSnapshotBlockPublicAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess):
        CfnSnapshotBlockPublicAccess = CfnSnapshotBlockPublicAccess(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshotBlockPublicAccess):
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess = wrapped.cdkObject
  }
}
