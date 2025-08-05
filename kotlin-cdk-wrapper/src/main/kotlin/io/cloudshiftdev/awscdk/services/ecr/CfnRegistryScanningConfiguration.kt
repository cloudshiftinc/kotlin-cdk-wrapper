@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The scanning configuration for a private registry.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * CfnRegistryScanningConfiguration cfnRegistryScanningConfiguration =
 * CfnRegistryScanningConfiguration.Builder.create(this, "MyCfnRegistryScanningConfiguration")
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
public open class CfnRegistryScanningConfiguration(
  cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRegistryScanningConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRegistryScanningConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRegistryScanningConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRegistryScanningConfigurationProps(props)
  )

  /**
   * The account ID of the destination registry.
   */
  public open fun attrRegistryId(): String = unwrap(this).getAttrRegistryId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The scanning rules associated with the registry.
   */
  public open fun rules(): Any = unwrap(this).getRules()

  /**
   * The scanning rules associated with the registry.
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The scanning rules associated with the registry.
   */
  public open fun rules(`value`: List<Any>) {
    unwrap(this).setRules(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The scanning rules associated with the registry.
   */
  public open fun rules(vararg `value`: Any): Unit = rules(`value`.toList())

  /**
   * The type of scanning configured for the registry.
   */
  public open fun scanType(): String = unwrap(this).getScanType()

  /**
   * The type of scanning configured for the registry.
   */
  public open fun scanType(`value`: String) {
    unwrap(this).setScanType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecr.CfnRegistryScanningConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     * @param rules The scanning rules associated with the registry. 
     */
    public fun rules(rules: IResolvable)

    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     * @param rules The scanning rules associated with the registry. 
     */
    public fun rules(rules: List<Any>)

    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     * @param rules The scanning rules associated with the registry. 
     */
    public fun rules(vararg rules: Any)

    /**
     * The type of scanning configured for the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-scantype)
     * @param scanType The type of scanning configured for the registry. 
     */
    public fun scanType(scanType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.Builder =
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.Builder.create(scope,
        id)

    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     * @param rules The scanning rules associated with the registry. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     * @param rules The scanning rules associated with the registry. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The scanning rules associated with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-rules)
     * @param rules The scanning rules associated with the registry. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * The type of scanning configured for the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registryscanningconfiguration.html#cfn-ecr-registryscanningconfiguration-scantype)
     * @param scanType The type of scanning configured for the registry. 
     */
    override fun scanType(scanType: String) {
      cdkBuilder.scanType(scanType)
    }

    public fun build(): software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRegistryScanningConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRegistryScanningConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration):
        CfnRegistryScanningConfiguration = CfnRegistryScanningConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryScanningConfiguration):
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration
  }

  /**
   * The filter settings used with image replication.
   *
   * Specifying a repository filter to a replication rule provides a method for controlling which
   * repositories in a private registry are replicated. If no filters are added, the contents of all
   * repositories are replicated.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * RepositoryFilterProperty repositoryFilterProperty = RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-repositoryfilter.html)
   */
  public interface RepositoryFilterProperty {
    /**
     * The filter to use when scanning.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-repositoryfilter.html#cfn-ecr-registryscanningconfiguration-repositoryfilter-filter)
     */
    public fun filter(): String

    /**
     * The type associated with the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-repositoryfilter.html#cfn-ecr-registryscanningconfiguration-repositoryfilter-filtertype)
     */
    public fun filterType(): String

    /**
     * A builder for [RepositoryFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filter The filter to use when scanning. 
       */
      public fun filter(filter: String)

      /**
       * @param filterType The type associated with the filter. 
       */
      public fun filterType(filterType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty.builder()

      /**
       * @param filter The filter to use when scanning. 
       */
      override fun filter(filter: String) {
        cdkBuilder.filter(filter)
      }

      /**
       * @param filterType The type associated with the filter. 
       */
      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty,
    ) : CdkObject(cdkObject),
        RepositoryFilterProperty {
      /**
       * The filter to use when scanning.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-repositoryfilter.html#cfn-ecr-registryscanningconfiguration-repositoryfilter-filter)
       */
      override fun filter(): String = unwrap(this).getFilter()

      /**
       * The type associated with the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-repositoryfilter.html#cfn-ecr-registryscanningconfiguration-repositoryfilter-filtertype)
       */
      override fun filterType(): String = unwrap(this).getFilterType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty):
          RepositoryFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? RepositoryFilterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RepositoryFilterProperty):
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.RepositoryFilterProperty
    }
  }

  /**
   * The scanning rules associated with the registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecr.*;
   * ScanningRuleProperty scanningRuleProperty = ScanningRuleProperty.builder()
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .scanFrequency("scanFrequency")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-scanningrule.html)
   */
  public interface ScanningRuleProperty {
    /**
     * The details of a scanning repository filter.
     *
     * For more information on how to use filters, see [Using
     * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
     * in the *Amazon Elastic Container Registry User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-scanningrule.html#cfn-ecr-registryscanningconfiguration-scanningrule-repositoryfilters)
     */
    public fun repositoryFilters(): Any

    /**
     * The frequency that scans are performed at for a private registry.
     *
     * When the `ENHANCED` scan type is specified, the supported scan frequencies are
     * `CONTINUOUS_SCAN` and `SCAN_ON_PUSH` . When the `BASIC` scan type is specified, the
     * `SCAN_ON_PUSH` scan frequency is supported. If scan on push is not specified, then the `MANUAL`
     * scan frequency is set by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-scanningrule.html#cfn-ecr-registryscanningconfiguration-scanningrule-scanfrequency)
     */
    public fun scanFrequency(): String

    /**
     * A builder for [ScanningRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryFilters The details of a scanning repository filter. 
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       */
      public fun repositoryFilters(repositoryFilters: IResolvable)

      /**
       * @param repositoryFilters The details of a scanning repository filter. 
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       */
      public fun repositoryFilters(repositoryFilters: List<Any>)

      /**
       * @param repositoryFilters The details of a scanning repository filter. 
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       */
      public fun repositoryFilters(vararg repositoryFilters: Any)

      /**
       * @param scanFrequency The frequency that scans are performed at for a private registry. 
       * When the `ENHANCED` scan type is specified, the supported scan frequencies are
       * `CONTINUOUS_SCAN` and `SCAN_ON_PUSH` . When the `BASIC` scan type is specified, the
       * `SCAN_ON_PUSH` scan frequency is supported. If scan on push is not specified, then the
       * `MANUAL` scan frequency is set by default.
       */
      public fun scanFrequency(scanFrequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty.Builder
          =
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty.builder()

      /**
       * @param repositoryFilters The details of a scanning repository filter. 
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       */
      override fun repositoryFilters(repositoryFilters: IResolvable) {
        cdkBuilder.repositoryFilters(repositoryFilters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param repositoryFilters The details of a scanning repository filter. 
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       */
      override fun repositoryFilters(repositoryFilters: List<Any>) {
        cdkBuilder.repositoryFilters(repositoryFilters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param repositoryFilters The details of a scanning repository filter. 
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       */
      override fun repositoryFilters(vararg repositoryFilters: Any): Unit =
          repositoryFilters(repositoryFilters.toList())

      /**
       * @param scanFrequency The frequency that scans are performed at for a private registry. 
       * When the `ENHANCED` scan type is specified, the supported scan frequencies are
       * `CONTINUOUS_SCAN` and `SCAN_ON_PUSH` . When the `BASIC` scan type is specified, the
       * `SCAN_ON_PUSH` scan frequency is supported. If scan on push is not specified, then the
       * `MANUAL` scan frequency is set by default.
       */
      override fun scanFrequency(scanFrequency: String) {
        cdkBuilder.scanFrequency(scanFrequency)
      }

      public fun build():
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty,
    ) : CdkObject(cdkObject),
        ScanningRuleProperty {
      /**
       * The details of a scanning repository filter.
       *
       * For more information on how to use filters, see [Using
       * filters](https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters)
       * in the *Amazon Elastic Container Registry User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-scanningrule.html#cfn-ecr-registryscanningconfiguration-scanningrule-repositoryfilters)
       */
      override fun repositoryFilters(): Any = unwrap(this).getRepositoryFilters()

      /**
       * The frequency that scans are performed at for a private registry.
       *
       * When the `ENHANCED` scan type is specified, the supported scan frequencies are
       * `CONTINUOUS_SCAN` and `SCAN_ON_PUSH` . When the `BASIC` scan type is specified, the
       * `SCAN_ON_PUSH` scan frequency is supported. If scan on push is not specified, then the
       * `MANUAL` scan frequency is set by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-registryscanningconfiguration-scanningrule.html#cfn-ecr-registryscanningconfiguration-scanningrule-scanfrequency)
       */
      override fun scanFrequency(): String = unwrap(this).getScanFrequency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScanningRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty):
          ScanningRuleProperty = CdkObjectWrappers.wrap(cdkObject) as? ScanningRuleProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScanningRuleProperty):
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecr.CfnRegistryScanningConfiguration.ScanningRuleProperty
    }
  }
}
