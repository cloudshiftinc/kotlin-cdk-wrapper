@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnOrganizationProps {
  public fun featureSet(): String? = unwrap(this).getFeatureSet()

  @CdkDslMarker
  public interface Builder {
    public fun featureSet(featureSet: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.organizations.CfnOrganizationProps.Builder =
        software.amazon.awscdk.services.organizations.CfnOrganizationProps.builder()

    override fun featureSet(featureSet: String) {
      cdkBuilder.featureSet(featureSet)
    }

    public fun build(): software.amazon.awscdk.services.organizations.CfnOrganizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationProps,
  ) : CdkObject(cdkObject), CfnOrganizationProps {
    override fun featureSet(): String? = unwrap(this).getFeatureSet()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOrganizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnOrganizationProps):
        CfnOrganizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOrganizationProps):
        software.amazon.awscdk.services.organizations.CfnOrganizationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnOrganizationProps
  }
}
