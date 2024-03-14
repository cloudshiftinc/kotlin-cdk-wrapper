package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPCEConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun serviceDnsName(): String = unwrap(this).getServiceDnsName()

  public open fun serviceDnsName(`value`: String) {
    unwrap(this).setServiceDnsName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpceConfigurationDescription(): String? =
      unwrap(this).getVpceConfigurationDescription()

  public open fun vpceConfigurationDescription(`value`: String) {
    unwrap(this).setVpceConfigurationDescription(`value`)
  }

  public open fun vpceConfigurationName(): String = unwrap(this).getVpceConfigurationName()

  public open fun vpceConfigurationName(`value`: String) {
    unwrap(this).setVpceConfigurationName(`value`)
  }

  public open fun vpceServiceName(): String = unwrap(this).getVpceServiceName()

  public open fun vpceServiceName(`value`: String) {
    unwrap(this).setVpceServiceName(`value`)
  }

  public interface Builder {
    public fun serviceDnsName(serviceDnsName: String)

    public fun tags(tags: List<CfnTag>)

    public fun vpceConfigurationDescription(vpceConfigurationDescription: String)

    public fun vpceConfigurationName(vpceConfigurationName: String)

    public fun vpceServiceName(vpceServiceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration.Builder
        = software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration.Builder.create(scope, id)

    override fun serviceDnsName(serviceDnsName: String) {
      cdkBuilder.serviceDnsName(serviceDnsName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
      cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
    }

    override fun vpceConfigurationName(vpceConfigurationName: String) {
      cdkBuilder.vpceConfigurationName(vpceConfigurationName)
    }

    override fun vpceServiceName(vpceServiceName: String) {
      cdkBuilder.vpceServiceName(vpceServiceName)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration):
        CfnVPCEConfiguration = CfnVPCEConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEConfiguration):
        software.amazon.awscdk.services.devicefarm.CfnVPCEConfiguration = wrapped.cdkObject
  }
}
