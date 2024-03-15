@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnVehicleProps {
  public fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

  public fun attributes(): Any? = unwrap(this).getAttributes()

  public fun decoderManifestArn(): String

  public fun modelManifestArn(): String

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun associationBehavior(associationBehavior: String)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun decoderManifestArn(decoderManifestArn: String)

    public fun modelManifestArn(modelManifestArn: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps.builder()

    override fun associationBehavior(associationBehavior: String) {
      cdkBuilder.associationBehavior(associationBehavior)
    }

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun decoderManifestArn(decoderManifestArn: String) {
      cdkBuilder.decoderManifestArn(decoderManifestArn)
    }

    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps,
  ) : CdkObject(cdkObject), CfnVehicleProps {
    override fun associationBehavior(): String? = unwrap(this).getAssociationBehavior()

    override fun attributes(): Any? = unwrap(this).getAttributes()

    override fun decoderManifestArn(): String = unwrap(this).getDecoderManifestArn()

    override fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVehicleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps):
        CfnVehicleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVehicleProps):
        software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnVehicleProps
  }
}
