@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrProfileArn(): String = unwrap(this).getAttrProfileArn()

  public open fun attrProfileId(): String = unwrap(this).getAttrProfileId()

  public open fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

  public open fun durationSeconds(`value`: Number) {
    unwrap(this).setDurationSeconds(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
      emptyList()

  public open fun managedPolicyArns(`value`: List<String>) {
    unwrap(this).setManagedPolicyArns(`value`)
  }

  public open fun managedPolicyArns(vararg `value`: String): Unit =
      managedPolicyArns(`value`.toList())

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun requireInstanceProperties(): Any? = unwrap(this).getRequireInstanceProperties()

  public open fun requireInstanceProperties(`value`: Boolean) {
    unwrap(this).setRequireInstanceProperties(`value`)
  }

  public open fun requireInstanceProperties(`value`: IResolvable) {
    unwrap(this).setRequireInstanceProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun roleArns(): List<String> = unwrap(this).getRoleArns()

  public open fun roleArns(`value`: List<String>) {
    unwrap(this).setRoleArns(`value`)
  }

  public open fun roleArns(vararg `value`: String): Unit = roleArns(`value`.toList())

  public open fun sessionPolicy(): String? = unwrap(this).getSessionPolicy()

  public open fun sessionPolicy(`value`: String) {
    unwrap(this).setSessionPolicy(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun durationSeconds(durationSeconds: Number)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun managedPolicyArns(vararg managedPolicyArns: String)

    public fun name(name: String)

    public fun requireInstanceProperties(requireInstanceProperties: Boolean)

    public fun requireInstanceProperties(requireInstanceProperties: IResolvable)

    public fun roleArns(roleArns: List<String>)

    public fun roleArns(vararg roleArns: String)

    public fun sessionPolicy(sessionPolicy: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnProfile.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnProfile.Builder.create(scope, id)

    override fun durationSeconds(durationSeconds: Number) {
      cdkBuilder.durationSeconds(durationSeconds)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun requireInstanceProperties(requireInstanceProperties: Boolean) {
      cdkBuilder.requireInstanceProperties(requireInstanceProperties)
    }

    override fun requireInstanceProperties(requireInstanceProperties: IResolvable) {
      cdkBuilder.requireInstanceProperties(requireInstanceProperties.let(IResolvable::unwrap))
    }

    override fun roleArns(roleArns: List<String>) {
      cdkBuilder.roleArns(roleArns)
    }

    override fun roleArns(vararg roleArns: String): Unit = roleArns(roleArns.toList())

    override fun sessionPolicy(sessionPolicy: String) {
      cdkBuilder.sessionPolicy(sessionPolicy)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rolesanywhere.CfnProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfile):
        CfnProfile = CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile):
        software.amazon.awscdk.services.rolesanywhere.CfnProfile = wrapped.cdkObject
  }
}
