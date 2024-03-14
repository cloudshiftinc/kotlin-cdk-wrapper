package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRegistryPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): Any = unwrap(this).getPolicy()

  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun registryName(): String = unwrap(this).getRegistryName()

  public open fun registryName(`value`: String) {
    unwrap(this).setRegistryName(`value`)
  }

  public open fun revisionId(): String? = unwrap(this).getRevisionId()

  public open fun revisionId(`value`: String) {
    unwrap(this).setRevisionId(`value`)
  }

  public interface Builder {
    public fun policy(policy: Any)

    public fun registryName(registryName: String)

    public fun revisionId(revisionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy.Builder.create(scope, id)

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    override fun revisionId(revisionId: String) {
      cdkBuilder.revisionId(revisionId)
    }

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegistryPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegistryPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy):
        CfnRegistryPolicy = CfnRegistryPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryPolicy):
        software.amazon.awscdk.services.eventschemas.CfnRegistryPolicy = wrapped.cdkObject
  }
}
