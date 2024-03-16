@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sdb.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html)
 */
public interface CfnDomainProps {
  /**
   * Information about the SimpleDB domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Information about the SimpleDB domain.
     */
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sdb.CfnDomainProps.Builder =
        software.amazon.awscdk.services.sdb.CfnDomainProps.builder()

    /**
     * @param description Information about the SimpleDB domain.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.sdb.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sdb.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * Information about the SimpleDB domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sdb-domain.html#cfn-sdb-domain-description)
     */
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sdb.CfnDomainProps): CfnDomainProps
        = CdkObjectWrappers.wrap(cdkObject) as CfnDomainProps

    internal fun unwrap(wrapped: CfnDomainProps): software.amazon.awscdk.services.sdb.CfnDomainProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sdb.CfnDomainProps
  }
}
