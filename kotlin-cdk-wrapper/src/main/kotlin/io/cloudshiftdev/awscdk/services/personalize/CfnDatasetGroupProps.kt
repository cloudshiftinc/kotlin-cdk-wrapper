@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDatasetGroupProps {
  public fun domain(): String? = unwrap(this).getDomain()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun name(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun domain(domain: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnDatasetGroupProps.Builder
        = software.amazon.awscdk.services.personalize.CfnDatasetGroupProps.builder()

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnDatasetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroupProps,
  ) : CdkObject(cdkObject), CfnDatasetGroupProps {
    override fun domain(): String? = unwrap(this).getDomain()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnDatasetGroupProps):
        CfnDatasetGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetGroupProps):
        software.amazon.awscdk.services.personalize.CfnDatasetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnDatasetGroupProps
  }
}
