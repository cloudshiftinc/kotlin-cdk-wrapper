package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSecurityKey internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKey,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun key(): String = unwrap(this).getKey()

  public open fun key(`value`: String) {
    unwrap(this).setKey(`value`)
  }

  public interface Builder {
    public fun instanceId(instanceId: String)

    public fun key(key: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityKey.Builder =
        software.amazon.awscdk.services.connect.CfnSecurityKey.Builder.create(scope, id)

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityKey = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKey):
        CfnSecurityKey = CfnSecurityKey(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityKey):
        software.amazon.awscdk.services.connect.CfnSecurityKey = wrapped.cdkObject
  }
}
