package io.cloudshiftdev.awscdk.services.robomaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRobot internal constructor(
  private val cdkObject: software.amazon.awscdk.services.robomaker.CfnRobot,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun architecture(): String = unwrap(this).getArchitecture()

  public open fun architecture(`value`: String) {
    unwrap(this).setArchitecture(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun fleet(): String? = unwrap(this).getFleet()

  public open fun fleet(`value`: String) {
    unwrap(this).setFleet(`value`)
  }

  public open fun greengrassGroupId(): String = unwrap(this).getGreengrassGroupId()

  public open fun greengrassGroupId(`value`: String) {
    unwrap(this).setGreengrassGroupId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun architecture(architecture: String) {
    }

    public fun fleet(fleet: String) {
    }

    public fun greengrassGroupId(greengrassGroupId: String) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.robomaker.CfnRobot.Builder =
        software.amazon.awscdk.services.robomaker.CfnRobot.Builder.create(scope, id)

    public override fun architecture(architecture: String) {
      cdkBuilder.architecture(architecture)
    }

    public override fun fleet(fleet: String) {
      cdkBuilder.fleet(fleet)
    }

    public override fun greengrassGroupId(greengrassGroupId: String) {
      cdkBuilder.greengrassGroupId(greengrassGroupId)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.robomaker.CfnRobot = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRobot {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRobot(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.robomaker.CfnRobot): CfnRobot =
        CfnRobot(cdkObject)

    internal fun unwrap(wrapped: CfnRobot): software.amazon.awscdk.services.robomaker.CfnRobot =
        wrapped.cdkObject
  }
}
