@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInstanceProps {
  public fun attributes(): Any

  public fun directoryId(): String? = unwrap(this).getDirectoryId()

  public fun identityManagementType(): String

  public fun instanceAlias(): String? = unwrap(this).getInstanceAlias()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: CfnInstance.AttributesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f9064a81551068452a07f3eda544db73055a080aa9892a96a766b6bda86e54")
    public fun attributes(attributes: CfnInstance.AttributesProperty.Builder.() -> Unit)

    public fun directoryId(directoryId: String)

    public fun identityManagementType(identityManagementType: String)

    public fun instanceAlias(instanceAlias: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.connect.CfnInstanceProps.builder()

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: CfnInstance.AttributesProperty) {
      cdkBuilder.attributes(attributes.let(CfnInstance.AttributesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("57f9064a81551068452a07f3eda544db73055a080aa9892a96a766b6bda86e54")
    override fun attributes(attributes: CfnInstance.AttributesProperty.Builder.() -> Unit): Unit =
        attributes(CfnInstance.AttributesProperty(attributes))

    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    override fun identityManagementType(identityManagementType: String) {
      cdkBuilder.identityManagementType(identityManagementType)
    }

    override fun instanceAlias(instanceAlias: String) {
      cdkBuilder.instanceAlias(instanceAlias)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnInstanceProps,
  ) : CdkObject(cdkObject), CfnInstanceProps {
    override fun attributes(): Any = unwrap(this).getAttributes()

    override fun directoryId(): String? = unwrap(this).getDirectoryId()

    override fun identityManagementType(): String = unwrap(this).getIdentityManagementType()

    override fun instanceAlias(): String? = unwrap(this).getInstanceAlias()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstanceProps):
        CfnInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.connect.CfnInstanceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.connect.CfnInstanceProps
  }
}
