@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRegistryScanningConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnRegistryScanningConfigurationProps cfnRegistryScanningConfigurationProps =
 * CfnRegistryScanningConfigurationProps.builder()
 * .rules(List.of(ScanningRuleProperty.builder()
 * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
 * .filter("filter")
 * .filterType("filterType")
 * .build()))
 * .scanFrequency("scanFrequency")
 * .build()))
 * .scanType("scanType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html)
 */
public interface CfnRegistryScanningConfigurationProps {
  /**
   * The scanning rules associated with the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
   */
  public fun rules(): Any

  /**
   * The type of scanning configured for the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-scantype)
   */
  public fun scanType(): String

  /**
   * A builder for [CfnRegistryScanningConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param rules The scanning rules associated with the registry. 
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules The scanning rules associated with the registry. 
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules The scanning rules associated with the registry. 
     */
    public fun rules(vararg rules: Any)

    /**
     * @param scanType The type of scanning configured for the registry. 
     */
    public fun scanType(scanType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps.Builder =
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps.builder()

    /**
     * @param rules The scanning rules associated with the registry. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param rules The scanning rules associated with the registry. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param rules The scanning rules associated with the registry. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * @param scanType The type of scanning configured for the registry. 
     */
    override fun scanType(scanType: String) {
      cdkBuilder.scanType(scanType)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnRegistryScanningConfigurationProps {
    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     */
    override fun rules(): Any = unwrap(this).getRules()

    /**
     * The type of scanning configured for the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-scantype)
     */
    override fun scanType(): String = unwrap(this).getScanType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnRegistryScanningConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps):
        CfnRegistryScanningConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRegistryScanningConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryScanningConfigurationProps):
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfigurationProps
  }
}
