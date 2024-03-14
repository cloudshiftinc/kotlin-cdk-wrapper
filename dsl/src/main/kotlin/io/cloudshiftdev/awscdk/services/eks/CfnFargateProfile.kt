package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFargateProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

  public open fun fargateProfileName(`value`: String) {
    unwrap(this).setFargateProfileName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun podExecutionRoleArn(): String = unwrap(this).getPodExecutionRoleArn()

  public open fun podExecutionRoleArn(`value`: String) {
    unwrap(this).setPodExecutionRoleArn(`value`)
  }

  public open fun selectors(): Any = unwrap(this).getSelectors()

  public open fun selectors(`value`: IResolvable) {
    unwrap(this).setSelectors(`value`.let(IResolvable::unwrap))
  }

  public open fun selectors(__idx_ac66f0: List<Any>) {
    unwrap(this).setSelectors(__idx_ac66f0)
  }

  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun clusterName(clusterName: String) {
    }

    public fun fargateProfileName(fargateProfileName: String) {
    }

    public fun podExecutionRoleArn(podExecutionRoleArn: String) {
    }

    public fun selectors(selectors: IResolvable) {
    }

    public fun selectors(selectors: List<Any>) {
    }

    public fun subnets(subnets: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnFargateProfile.Builder =
        software.amazon.awscdk.services.eks.CfnFargateProfile.Builder.create(scope, id)

    public override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    public override fun podExecutionRoleArn(podExecutionRoleArn: String) {
      cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
    }

    public override fun selectors(selectors: IResolvable) {
      cdkBuilder.selectors(selectors.let(IResolvable::unwrap))
    }

    public override fun selectors(selectors: List<Any>) {
      cdkBuilder.selectors(selectors)
    }

    public override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFargateProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFargateProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile):
        CfnFargateProfile = CfnFargateProfile(cdkObject)

    internal fun unwrap(wrapped: CfnFargateProfile):
        software.amazon.awscdk.services.eks.CfnFargateProfile = wrapped.cdkObject
  }

  public interface LabelProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty.Builder =
          software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty.builder()

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty,
    ) : LabelProperty {
      public override fun key(): String = unwrap(this).getKey()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty):
          LabelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelProperty):
          software.amazon.awscdk.services.eks.CfnFargateProfile.LabelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SelectorProperty {
    public fun labels(): Any? = unwrap(this).getLabels()

    public fun namespace(): String

    public interface Builder {
      public fun labels(labels: IResolvable) {
      }

      public fun labels(labels: List<Any>) {
      }

      public fun namespace(namespace: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty.Builder =
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty.builder()

      public override fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels.let(IResolvable::unwrap))
      }

      public override fun labels(labels: List<Any>) {
        cdkBuilder.labels(labels)
      }

      public override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty,
    ) : SelectorProperty {
      public override fun labels(): Any? = unwrap(this).getLabels()

      public override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty):
          SelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelectorProperty):
          software.amazon.awscdk.services.eks.CfnFargateProfile.SelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
