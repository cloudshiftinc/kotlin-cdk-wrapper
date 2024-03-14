package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnHub internal constructor(
  private val cdkObject: software.amazon.awscdk.services.securityhub.CfnHub,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrSubscribedAt(): String = unwrap(this).getAttrSubscribedAt()

  public open fun autoEnableControls(): Any? = unwrap(this).getAutoEnableControls()

  public open fun autoEnableControls(`value`: Boolean) {
    unwrap(this).setAutoEnableControls(`value`)
  }

  public open fun autoEnableControls(`value`: IResolvable) {
    unwrap(this).setAutoEnableControls(`value`.let(IResolvable::unwrap))
  }

  public open fun controlFindingGenerator(): String? = unwrap(this).getControlFindingGenerator()

  public open fun controlFindingGenerator(`value`: String) {
    unwrap(this).setControlFindingGenerator(`value`)
  }

  public open fun enableDefaultStandards(): Any? = unwrap(this).getEnableDefaultStandards()

  public open fun enableDefaultStandards(`value`: Boolean) {
    unwrap(this).setEnableDefaultStandards(`value`)
  }

  public open fun enableDefaultStandards(`value`: IResolvable) {
    unwrap(this).setEnableDefaultStandards(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun autoEnableControls(autoEnableControls: Boolean) {
    }

    public fun autoEnableControls(autoEnableControls: IResolvable) {
    }

    public fun controlFindingGenerator(controlFindingGenerator: String) {
    }

    public fun enableDefaultStandards(enableDefaultStandards: Boolean) {
    }

    public fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
    }

    public fun tags(tags: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnHub.Builder =
        software.amazon.awscdk.services.securityhub.CfnHub.Builder.create(scope, id)

    public override fun autoEnableControls(autoEnableControls: Boolean) {
      cdkBuilder.autoEnableControls(autoEnableControls)
    }

    public override fun autoEnableControls(autoEnableControls: IResolvable) {
      cdkBuilder.autoEnableControls(autoEnableControls.let(IResolvable::unwrap))
    }

    public override fun controlFindingGenerator(controlFindingGenerator: String) {
      cdkBuilder.controlFindingGenerator(controlFindingGenerator)
    }

    public override fun enableDefaultStandards(enableDefaultStandards: Boolean) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards)
    }

    public override fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
      cdkBuilder.enableDefaultStandards(enableDefaultStandards.let(IResolvable::unwrap))
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnHub = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHub {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHub(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnHub): CfnHub =
        CfnHub(cdkObject)

    internal fun unwrap(wrapped: CfnHub): software.amazon.awscdk.services.securityhub.CfnHub =
        wrapped.cdkObject
  }
}
