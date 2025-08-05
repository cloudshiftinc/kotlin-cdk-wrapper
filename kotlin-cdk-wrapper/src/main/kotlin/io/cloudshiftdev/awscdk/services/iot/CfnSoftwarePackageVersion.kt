@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::IoT::SoftwarePackageVersion` resource to create a software package version.
 *
 * For information about working with software package versions, see [AWS IoT Device Management
 * Software Package
 * Catalog](https://docs.aws.amazon.com/iot/latest/developerguide/software-package-catalog.html) and
 * [Creating a software package and package
 * version](https://docs.aws.amazon.com/iot/latest/developerguide/creating-package-and-version.html) in
 * the *AWS IoT Developer Guide* . See also,
 * [CreatePackageVersion](https://docs.aws.amazon.com/iot/latest/apireference/API_CreatePackageVersion.html)
 * in the *API Guide* .
 *
 *
 * The associated software package must exist before the package version is created. If you create a
 * software package and package version in the same CloudFormation template, set the software package
 * as a
 * [dependency](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * of the package version. If they are created out of sequence, you will receive an error.
 *
 * Package versions and created in a `draft` state, for more information, see [Package version
 * lifecycle](https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle)
 * . To change the package version state after it’s created, use the
 * [UpdatePackageVersionAPI](https://docs.aws.amazon.com/iot/latest/apireference/API_UpdatePackageVersion.html)
 * command.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSoftwarePackageVersion cfnSoftwarePackageVersion =
 * CfnSoftwarePackageVersion.Builder.create(this, "MyCfnSoftwarePackageVersion")
 * .packageName("packageName")
 * // the properties below are optional
 * .artifact(PackageVersionArtifactProperty.builder()
 * .s3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .version("version")
 * .build())
 * .build())
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .description("description")
 * .recipe("recipe")
 * .sbom(SbomProperty.builder()
 * .s3Location(S3LocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .version("version")
 * .build())
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .versionName("versionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html)
 */
public open class CfnSoftwarePackageVersion(
  cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSoftwarePackageVersionProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSoftwarePackageVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSoftwarePackageVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSoftwarePackageVersionProps(props)
  )

  /**
   * The artifact location of the package version.
   */
  public open fun artifact(): Any? = unwrap(this).getArtifact()

  /**
   * The artifact location of the package version.
   */
  public open fun artifact(`value`: IResolvable) {
    unwrap(this).setArtifact(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The artifact location of the package version.
   */
  public open fun artifact(`value`: PackageVersionArtifactProperty) {
    unwrap(this).setArtifact(`value`.let(PackageVersionArtifactProperty.Companion::unwrap))
  }

  /**
   * The artifact location of the package version.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f7ba24b0b41c126fb60c783d52a064065a47f72fdc73fe2c4ff3903180e2b9e")
  public open fun artifact(`value`: PackageVersionArtifactProperty.Builder.() -> Unit): Unit =
      artifact(PackageVersionArtifactProperty(`value`))

  /**
   * Error reason for a package version failure during creation or update.
   */
  public open fun attrErrorReason(): String = unwrap(this).getAttrErrorReason()

  /**
   * The Amazon Resource Name (ARN) for the package.
   */
  public open fun attrPackageVersionArn(): String = unwrap(this).getAttrPackageVersionArn()

  /**
   * The validation status of the Sbom file.
   */
  public open fun attrSbomValidationStatus(): String = unwrap(this).getAttrSbomValidationStatus()

  /**
   * The status of the package version.
   *
   * For more information, see [Package version
   * lifecycle](https://docs.aws.amazon.com/iot/latest/developerguide/preparing-to-use-software-package-catalog.html#package-version-lifecycle)
   * .
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * Metadata that can be used to define a package version’s configuration.
   */
  public open fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * Metadata that can be used to define a package version’s configuration.
   */
  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  /**
   * Metadata that can be used to define a package version’s configuration.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A summary of the package version being created.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A summary of the package version being created.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the associated software package.
   */
  public open fun packageName(): String = unwrap(this).getPackageName()

  /**
   * The name of the associated software package.
   */
  public open fun packageName(`value`: String) {
    unwrap(this).setPackageName(`value`)
  }

  /**
   * The inline json job document associated with a software package version.
   */
  public open fun recipe(): String? = unwrap(this).getRecipe()

  /**
   * The inline json job document associated with a software package version.
   */
  public open fun recipe(`value`: String) {
    unwrap(this).setRecipe(`value`)
  }

  /**
   * The sbom zip archive location of the package version.
   */
  public open fun sbom(): Any? = unwrap(this).getSbom()

  /**
   * The sbom zip archive location of the package version.
   */
  public open fun sbom(`value`: IResolvable) {
    unwrap(this).setSbom(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The sbom zip archive location of the package version.
   */
  public open fun sbom(`value`: SbomProperty) {
    unwrap(this).setSbom(`value`.let(SbomProperty.Companion::unwrap))
  }

  /**
   * The sbom zip archive location of the package version.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d3a08cd3158b4ee22ea5b21bf1d95e0c76788a891c577d9b35f037589aca5677")
  public open fun sbom(`value`: SbomProperty.Builder.() -> Unit): Unit = sbom(SbomProperty(`value`))

  /**
   * Metadata that can be used to manage the package version.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that can be used to manage the package version.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that can be used to manage the package version.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the new package version.
   */
  public open fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * The name of the new package version.
   */
  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnSoftwarePackageVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     * @param artifact The artifact location of the package version. 
     */
    public fun artifact(artifact: IResolvable)

    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     * @param artifact The artifact location of the package version. 
     */
    public fun artifact(artifact: PackageVersionArtifactProperty)

    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     * @param artifact The artifact location of the package version. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a69ccedaf5b5959b07c5733a4d66999cc0254e1b02b55d40f59a561b13123650")
    public fun artifact(artifact: PackageVersionArtifactProperty.Builder.() -> Unit)

    /**
     * Metadata that can be used to define a package version’s configuration.
     *
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes Metadata that can be used to define a package version’s configuration. 
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * Metadata that can be used to define a package version’s configuration.
     *
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes Metadata that can be used to define a package version’s configuration. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * A summary of the package version being created.
     *
     * This can be used to outline the package's contents or purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
     * @param description A summary of the package version being created. 
     */
    public fun description(description: String)

    /**
     * The name of the associated software package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
     * @param packageName The name of the associated software package. 
     */
    public fun packageName(packageName: String)

    /**
     * The inline json job document associated with a software package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-recipe)
     * @param recipe The inline json job document associated with a software package version. 
     */
    public fun recipe(recipe: String)

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     * @param sbom The sbom zip archive location of the package version. 
     */
    public fun sbom(sbom: IResolvable)

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     * @param sbom The sbom zip archive location of the package version. 
     */
    public fun sbom(sbom: SbomProperty)

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     * @param sbom The sbom zip archive location of the package version. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f55afff279b79ea51ce21e84e5a6cf65e10f48b1628a20d64b73fef930f2d47")
    public fun sbom(sbom: SbomProperty.Builder.() -> Unit)

    /**
     * Metadata that can be used to manage the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags Metadata that can be used to manage the package version. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that can be used to manage the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags Metadata that can be used to manage the package version. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the new package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
     * @param versionName The name of the new package version. 
     */
    public fun versionName(versionName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.Builder.create(scope, id)

    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     * @param artifact The artifact location of the package version. 
     */
    override fun artifact(artifact: IResolvable) {
      cdkBuilder.artifact(artifact.let(IResolvable.Companion::unwrap))
    }

    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     * @param artifact The artifact location of the package version. 
     */
    override fun artifact(artifact: PackageVersionArtifactProperty) {
      cdkBuilder.artifact(artifact.let(PackageVersionArtifactProperty.Companion::unwrap))
    }

    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     * @param artifact The artifact location of the package version. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a69ccedaf5b5959b07c5733a4d66999cc0254e1b02b55d40f59a561b13123650")
    override fun artifact(artifact: PackageVersionArtifactProperty.Builder.() -> Unit): Unit =
        artifact(PackageVersionArtifactProperty(artifact))

    /**
     * Metadata that can be used to define a package version’s configuration.
     *
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes Metadata that can be used to define a package version’s configuration. 
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * Metadata that can be used to define a package version’s configuration.
     *
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     * @param attributes Metadata that can be used to define a package version’s configuration. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * A summary of the package version being created.
     *
     * This can be used to outline the package's contents or purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
     * @param description A summary of the package version being created. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the associated software package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
     * @param packageName The name of the associated software package. 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * The inline json job document associated with a software package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-recipe)
     * @param recipe The inline json job document associated with a software package version. 
     */
    override fun recipe(recipe: String) {
      cdkBuilder.recipe(recipe)
    }

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     * @param sbom The sbom zip archive location of the package version. 
     */
    override fun sbom(sbom: IResolvable) {
      cdkBuilder.sbom(sbom.let(IResolvable.Companion::unwrap))
    }

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     * @param sbom The sbom zip archive location of the package version. 
     */
    override fun sbom(sbom: SbomProperty) {
      cdkBuilder.sbom(sbom.let(SbomProperty.Companion::unwrap))
    }

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     * @param sbom The sbom zip archive location of the package version. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f55afff279b79ea51ce21e84e5a6cf65e10f48b1628a20d64b73fef930f2d47")
    override fun sbom(sbom: SbomProperty.Builder.() -> Unit): Unit = sbom(SbomProperty(sbom))

    /**
     * Metadata that can be used to manage the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags Metadata that can be used to manage the package version. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata that can be used to manage the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     * @param tags Metadata that can be used to manage the package version. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the new package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
     * @param versionName The name of the new package version. 
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSoftwarePackageVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSoftwarePackageVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion):
        CfnSoftwarePackageVersion = CfnSoftwarePackageVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageVersion):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion
  }

  /**
   * The artifact location of the package version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * PackageVersionArtifactProperty packageVersionArtifactProperty =
   * PackageVersionArtifactProperty.builder()
   * .s3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-packageversionartifact.html)
   */
  public interface PackageVersionArtifactProperty {
    /**
     * The Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-packageversionartifact.html#cfn-iot-softwarepackageversion-packageversionartifact-s3location)
     */
    public fun s3Location(): Any

    /**
     * A builder for [PackageVersionArtifactProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Location The Amazon S3 location. 
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location The Amazon S3 location. 
       */
      public fun s3Location(s3Location: S3LocationProperty)

      /**
       * @param s3Location The Amazon S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("563554784a6e6dc4364063d8faf3057ccd39ba27576af50cc5bc5c4d6cc984ed")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty.builder()

      /**
       * @param s3Location The Amazon S3 location. 
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Location The Amazon S3 location. 
       */
      override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param s3Location The Amazon S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("563554784a6e6dc4364063d8faf3057ccd39ba27576af50cc5bc5c4d6cc984ed")
      override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      public fun build():
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty,
    ) : CdkObject(cdkObject),
        PackageVersionArtifactProperty {
      /**
       * The Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-packageversionartifact.html#cfn-iot-softwarepackageversion-packageversionartifact-s3location)
       */
      override fun s3Location(): Any = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PackageVersionArtifactProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty):
          PackageVersionArtifactProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PackageVersionArtifactProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PackageVersionArtifactProperty):
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.PackageVersionArtifactProperty
    }
  }

  /**
   * The Amazon S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html#cfn-iot-softwarepackageversion-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The S3 key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html#cfn-iot-softwarepackageversion-s3location-key)
     */
    public fun key(): String

    /**
     * The S3 version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html#cfn-iot-softwarepackageversion-s3location-version)
     */
    public fun version(): String

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The S3 bucket. 
       */
      public fun bucket(bucket: String)

      /**
       * @param key The S3 key. 
       */
      public fun key(key: String)

      /**
       * @param version The S3 version. 
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty.builder()

      /**
       * @param bucket The S3 bucket. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The S3 key. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param version The S3 version. 
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * The S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html#cfn-iot-softwarepackageversion-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The S3 key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html#cfn-iot-softwarepackageversion-s3location-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The S3 version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-s3location.html#cfn-iot-softwarepackageversion-s3location-version)
       */
      override fun version(): String = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.S3LocationProperty
    }
  }

  /**
   * The sbom zip archive location of the package version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * SbomProperty sbomProperty = SbomProperty.builder()
   * .s3Location(S3LocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-sbom.html)
   */
  public interface SbomProperty {
    /**
     * The Amazon S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-sbom.html#cfn-iot-softwarepackageversion-sbom-s3location)
     */
    public fun s3Location(): Any

    /**
     * A builder for [SbomProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Location The Amazon S3 location. 
       */
      public fun s3Location(s3Location: IResolvable)

      /**
       * @param s3Location The Amazon S3 location. 
       */
      public fun s3Location(s3Location: S3LocationProperty)

      /**
       * @param s3Location The Amazon S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb853aa4455ede12d86747c54fd65be31bbb7e29a04e7305112a302784c81e70")
      public fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty.Builder =
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty.builder()

      /**
       * @param s3Location The Amazon S3 location. 
       */
      override fun s3Location(s3Location: IResolvable) {
        cdkBuilder.s3Location(s3Location.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Location The Amazon S3 location. 
       */
      override fun s3Location(s3Location: S3LocationProperty) {
        cdkBuilder.s3Location(s3Location.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param s3Location The Amazon S3 location. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb853aa4455ede12d86747c54fd65be31bbb7e29a04e7305112a302784c81e70")
      override fun s3Location(s3Location: S3LocationProperty.Builder.() -> Unit): Unit =
          s3Location(S3LocationProperty(s3Location))

      public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty,
    ) : CdkObject(cdkObject),
        SbomProperty {
      /**
       * The Amazon S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-softwarepackageversion-sbom.html#cfn-iot-softwarepackageversion-sbom-s3location)
       */
      override fun s3Location(): Any = unwrap(this).getS3Location()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SbomProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty):
          SbomProperty = CdkObjectWrappers.wrap(cdkObject) as? SbomProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SbomProperty):
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnSoftwarePackageVersion.SbomProperty
    }
  }
}
