@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnGroupProps {
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  public fun name(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun tags(): Any? = unwrap(this).getTags()

  @CdkDslMarker
  public interface Builder {
    public fun initialVersion(initialVersion: IResolvable)

    public fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742fa2edf54bc8935b58750fee1e5fa9d9eda7d1c4fd8d42a763d6ee334ad548")
    public fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnGroupProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnGroupProps.builder()

    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    override fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnGroup.GroupVersionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742fa2edf54bc8935b58750fee1e5fa9d9eda7d1c4fd8d42a763d6ee334ad548")
    override fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(CfnGroup.GroupVersionProperty(initialVersion))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupProps,
  ) : CdkObject(cdkObject), CfnGroupProps {
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnGroupProps):
        CfnGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupProps):
        software.amazon.awscdk.services.greengrass.CfnGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.greengrass.CfnGroupProps
  }
}
