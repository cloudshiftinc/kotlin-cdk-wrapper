@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::CloudFormation::ModuleVersion` resource registers the specified version of the module
 * with the CloudFormation registry.
 *
 * Registering a module makes it available for use in CloudFormation templates in your AWS account
 * and Region.
 *
 * For more information, see [Create reusable resource configurations that can be included across
 * templates with CloudFormation
 * modules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/modules.html) in the
 * *CloudFormation User Guide* .
 *
 * For information about the CloudFormation registry, see [Managing extensions with the
 * CloudFormation
 * registry](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/registry.html) in the *AWS
 * CloudFormation User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnModuleVersion cfnModuleVersion = CfnModuleVersion.Builder.create(this, "MyCfnModuleVersion")
 * .moduleName("moduleName")
 * .modulePackage("modulePackage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html)
 */
public open class CfnModuleVersion(
  cdkObject: software.amazon.awscdk.CfnModuleVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModuleVersionProps,
  ) :
      this(software.amazon.awscdk.CfnModuleVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnModuleVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModuleVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModuleVersionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the module.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The description of the module.
   */
  public open fun attrDescription(): String = unwrap(this).getAttrDescription()

  /**
   * The URL of a page providing detailed documentation for this module.
   */
  public open fun attrDocumentationUrl(): String = unwrap(this).getAttrDocumentationUrl()

  /**
   * Whether the specified module version is set as the default version.
   *
   * This applies only to private extensions you have registered in your account, and extensions
   * published by AWS . For public third-party extensions, whether they are activated in your account,
   * CloudFormation returns `null` .
   */
  public open fun attrIsDefaultVersion(): IResolvable =
      unwrap(this).getAttrIsDefaultVersion().let(IResolvable::wrap)

  /**
   * The schema that defines the module.
   */
  public open fun attrSchema(): String = unwrap(this).getAttrSchema()

  /**
   * When the specified private module version was registered or activated in your account.
   */
  public open fun attrTimeCreated(): String = unwrap(this).getAttrTimeCreated()

  /**
   * The ID of this version of the module.
   */
  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  /**
   * The visibility level that determines who can see and use this module in CloudFormation
   * operations:.
   *
   * * `PRIVATE` : The module is only visible and usable within the account where it was registered.
   * CloudFormation automatically marks any modules you register as `PRIVATE` .
   * * `PUBLIC` : The module is publicly visible and usable within any AWS account.
   */
  public open fun attrVisibility(): String = unwrap(this).getAttrVisibility()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the module being registered.
   */
  public open fun moduleName(): String = unwrap(this).getModuleName()

  /**
   * The name of the module being registered.
   */
  public open fun moduleName(`value`: String) {
    unwrap(this).setModuleName(`value`)
  }

  /**
   * A URL to the S3 bucket for the package that contains the template fragment and schema files for
   * the module version to register.
   */
  public open fun modulePackage(): String = unwrap(this).getModulePackage()

  /**
   * A URL to the S3 bucket for the package that contains the template fragment and schema files for
   * the module version to register.
   */
  public open fun modulePackage(`value`: String) {
    unwrap(this).setModulePackage(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.CfnModuleVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the module being registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulename)
     * @param moduleName The name of the module being registered. 
     */
    public fun moduleName(moduleName: String)

    /**
     * A URL to the S3 bucket for the package that contains the template fragment and schema files
     * for the module version to register.
     *
     * For more information, see [Module structure and
     * requirements](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules-structure.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the module version, you must have `s3:GetObject` permissions to access the S3
     * objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulepackage)
     * @param modulePackage A URL to the S3 bucket for the package that contains the template
     * fragment and schema files for the module version to register. 
     */
    public fun modulePackage(modulePackage: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnModuleVersion.Builder =
        software.amazon.awscdk.CfnModuleVersion.Builder.create(scope, id)

    /**
     * The name of the module being registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulename)
     * @param moduleName The name of the module being registered. 
     */
    override fun moduleName(moduleName: String) {
      cdkBuilder.moduleName(moduleName)
    }

    /**
     * A URL to the S3 bucket for the package that contains the template fragment and schema files
     * for the module version to register.
     *
     * For more information, see [Module structure and
     * requirements](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/modules-structure.html)
     * in the *AWS CloudFormation Command Line Interface (CLI) User Guide* .
     *
     *
     * To register the module version, you must have `s3:GetObject` permissions to access the S3
     * objects.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-moduleversion.html#cfn-cloudformation-moduleversion-modulepackage)
     * @param modulePackage A URL to the S3 bucket for the package that contains the template
     * fragment and schema files for the module version to register. 
     */
    override fun modulePackage(modulePackage: String) {
      cdkBuilder.modulePackage(modulePackage)
    }

    public fun build(): software.amazon.awscdk.CfnModuleVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.CfnModuleVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModuleVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModuleVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnModuleVersion): CfnModuleVersion =
        CfnModuleVersion(cdkObject)

    internal fun unwrap(wrapped: CfnModuleVersion): software.amazon.awscdk.CfnModuleVersion =
        wrapped.cdkObject as software.amazon.awscdk.CfnModuleVersion
  }
}
