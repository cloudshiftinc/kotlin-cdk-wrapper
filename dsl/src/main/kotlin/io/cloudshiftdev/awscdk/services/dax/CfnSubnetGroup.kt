package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSubnetGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun subnetGroupName(subnetGroupName: String)

    public fun subnetIds(subnetIds: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnSubnetGroup.Builder =
        software.amazon.awscdk.services.dax.CfnSubnetGroup.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnSubnetGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubnetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubnetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnSubnetGroup): CfnSubnetGroup
        = CfnSubnetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSubnetGroup): software.amazon.awscdk.services.dax.CfnSubnetGroup
        = wrapped.cdkObject
  }
}
