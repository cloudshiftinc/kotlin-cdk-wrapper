@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.supportapp

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAccountAlias`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.supportapp.*;
 * CfnAccountAliasProps cfnAccountAliasProps = CfnAccountAliasProps.builder()
 * .accountAlias("accountAlias")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html)
 */
public interface CfnAccountAliasProps {
  /**
   * An alias or short name for an AWS account .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html#cfn-supportapp-accountalias-accountalias)
   */
  public fun accountAlias(): String

  /**
   * A builder for [CfnAccountAliasProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountAlias An alias or short name for an AWS account . 
     */
    public fun accountAlias(accountAlias: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.supportapp.CfnAccountAliasProps.Builder
        = software.amazon.awscdk.services.supportapp.CfnAccountAliasProps.builder()

    /**
     * @param accountAlias An alias or short name for an AWS account . 
     */
    override fun accountAlias(accountAlias: String) {
      cdkBuilder.accountAlias(accountAlias)
    }

    public fun build(): software.amazon.awscdk.services.supportapp.CfnAccountAliasProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAliasProps,
  ) : CdkObject(cdkObject),
      CfnAccountAliasProps {
    /**
     * An alias or short name for an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html#cfn-supportapp-accountalias-accountalias)
     */
    override fun accountAlias(): String = unwrap(this).getAccountAlias()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountAliasProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.supportapp.CfnAccountAliasProps):
        CfnAccountAliasProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccountAliasProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountAliasProps):
        software.amazon.awscdk.services.supportapp.CfnAccountAliasProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
  }
}
