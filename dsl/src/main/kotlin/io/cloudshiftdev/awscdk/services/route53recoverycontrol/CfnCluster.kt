package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrClusterArn(): String = unwrap(this).getAttrClusterArn()

  public open fun attrClusterEndpoints(): IResolvable =
      unwrap(this).getAttrClusterEndpoints().let(IResolvable::wrap)

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnCluster =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnCluster):
        CfnCluster = CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster):
        software.amazon.awscdk.services.route53recoverycontrol.CfnCluster = wrapped.cdkObject
  }

  public interface ClusterEndpointProperty {
    public fun endpoint(): String? = unwrap(this).getEndpoint()

    public fun region(): String? = unwrap(this).getRegion()

    public interface Builder {
      public fun endpoint(endpoint: String)

      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty.Builder
          =
          software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty.builder()

      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty,
    ) : ClusterEndpointProperty {
      override fun endpoint(): String? = unwrap(this).getEndpoint()

      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty):
          ClusterEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterEndpointProperty):
          software.amazon.awscdk.services.route53recoverycontrol.CfnCluster.ClusterEndpointProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
