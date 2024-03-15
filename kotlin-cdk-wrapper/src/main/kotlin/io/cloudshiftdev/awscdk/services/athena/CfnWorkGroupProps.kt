@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWorkGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun recursiveDeleteOption(): Any? = unwrap(this).getRecursiveDeleteOption()

  public fun state(): String? = unwrap(this).getState()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun workGroupConfiguration(): Any? = unwrap(this).getWorkGroupConfiguration()

  @Deprecated(message = "deprecated in CDK")
  public fun workGroupConfigurationUpdates(): Any? = unwrap(this).getWorkGroupConfigurationUpdates()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun recursiveDeleteOption(recursiveDeleteOption: Boolean)

    public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable)

    public fun state(state: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workGroupConfiguration(workGroupConfiguration: IResolvable)

    public
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1286b8e844700d4de120ceee24d1ad5e8ba74d54cd7f2f806bfc22f1d110c39e")
    public
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb27a197a13edf01c0beb8d22a3712f3a63156b7060ff0e26ee2b39b3dad6e2e")
    public
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnWorkGroupProps.Builder =
        software.amazon.awscdk.services.athena.CfnWorkGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
    }

    override fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
      cdkBuilder.recursiveDeleteOption(recursiveDeleteOption.let(IResolvable::unwrap))
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(IResolvable::unwrap))
    }

    override
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty) {
      cdkBuilder.workGroupConfiguration(workGroupConfiguration.let(CfnWorkGroup.WorkGroupConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1286b8e844700d4de120ceee24d1ad5e8ba74d54cd7f2f806bfc22f1d110c39e")
    override
        fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty.Builder.() -> Unit):
        Unit =
        workGroupConfiguration(CfnWorkGroup.WorkGroupConfigurationProperty(workGroupConfiguration))

    @Deprecated(message = "deprecated in CDK")
    override fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: IResolvable) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty) {
      cdkBuilder.workGroupConfigurationUpdates(workGroupConfigurationUpdates.let(CfnWorkGroup.WorkGroupConfigurationUpdatesProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb27a197a13edf01c0beb8d22a3712f3a63156b7060ff0e26ee2b39b3dad6e2e")
    override
        fun workGroupConfigurationUpdates(workGroupConfigurationUpdates: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder.() -> Unit):
        Unit =
        workGroupConfigurationUpdates(CfnWorkGroup.WorkGroupConfigurationUpdatesProperty(workGroupConfigurationUpdates))

    public fun build(): software.amazon.awscdk.services.athena.CfnWorkGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroupProps,
  ) : CdkObject(cdkObject), CfnWorkGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun recursiveDeleteOption(): Any? = unwrap(this).getRecursiveDeleteOption()

    override fun state(): String? = unwrap(this).getState()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun workGroupConfiguration(): Any? = unwrap(this).getWorkGroupConfiguration()

    @Deprecated(message = "deprecated in CDK")
    override fun workGroupConfigurationUpdates(): Any? =
        unwrap(this).getWorkGroupConfigurationUpdates()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnWorkGroupProps):
        CfnWorkGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkGroupProps):
        software.amazon.awscdk.services.athena.CfnWorkGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.athena.CfnWorkGroupProps
  }
}
