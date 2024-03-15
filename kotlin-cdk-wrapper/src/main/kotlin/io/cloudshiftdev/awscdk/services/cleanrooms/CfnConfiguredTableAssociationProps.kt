@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanrooms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnConfiguredTableAssociationProps {
  public fun configuredTableIdentifier(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun membershipIdentifier(): String

  public fun name(): String

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun configuredTableIdentifier(configuredTableIdentifier: String)

    public fun description(description: String)

    public fun membershipIdentifier(membershipIdentifier: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps.Builder =
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps.builder()

    override fun configuredTableIdentifier(configuredTableIdentifier: String) {
      cdkBuilder.configuredTableIdentifier(configuredTableIdentifier)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun membershipIdentifier(membershipIdentifier: String) {
      cdkBuilder.membershipIdentifier(membershipIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps,
  ) : CdkObject(cdkObject), CfnConfiguredTableAssociationProps {
    override fun configuredTableIdentifier(): String = unwrap(this).getConfiguredTableIdentifier()

    override fun description(): String? = unwrap(this).getDescription()

    override fun membershipIdentifier(): String = unwrap(this).getMembershipIdentifier()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfiguredTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps):
        CfnConfiguredTableAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguredTableAssociationProps):
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps
  }
}
