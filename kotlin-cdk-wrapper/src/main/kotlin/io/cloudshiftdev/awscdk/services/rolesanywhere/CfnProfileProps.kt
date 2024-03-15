@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rolesanywhere

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProfileProps {
  public fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  public fun name(): String

  public fun requireInstanceProperties(): Any? = unwrap(this).getRequireInstanceProperties()

  public fun roleArns(): List<String>

  public fun sessionPolicy(): String? = unwrap(this).getSessionPolicy()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rolesanywhere.CfnProfileProps.Builder =
        software.amazon.awscdk.services.rolesanywhere.CfnProfileProps.builder()

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

    public fun build(): software.amazon.awscdk.services.rolesanywhere.CfnProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    override fun durationSeconds(): Number? = unwrap(this).getDurationSeconds()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun requireInstanceProperties(): Any? = unwrap(this).getRequireInstanceProperties()

    override fun roleArns(): List<String> = unwrap(this).getRoleArns()

    override fun sessionPolicy(): String? = unwrap(this).getSessionPolicy()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rolesanywhere.CfnProfileProps):
        CfnProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.rolesanywhere.CfnProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rolesanywhere.CfnProfileProps
  }
}
