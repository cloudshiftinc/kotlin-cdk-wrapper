@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSoftwarePackageVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnSoftwarePackageVersionProps cfnSoftwarePackageVersionProps =
 * CfnSoftwarePackageVersionProps.builder()
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
public interface CfnSoftwarePackageVersionProps {
  /**
   * The artifact location of the package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
   */
  public fun artifact(): Any? = unwrap(this).getArtifact()

  /**
   * Metadata that can be used to define a package version’s configuration.
   *
   * For example, the S3 file location, configuration options that are being sent to the device or
   * fleet.
   *
   * The combined size of all the attributes on a package version is limited to 3KB.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
   */
  public fun attributes(): Any? = unwrap(this).getAttributes()

  /**
   * A summary of the package version being created.
   *
   * This can be used to outline the package's contents or purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the associated software package.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
   */
  public fun packageName(): String

  /**
   * The inline json job document associated with a software package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-recipe)
   */
  public fun recipe(): String? = unwrap(this).getRecipe()

  /**
   * The sbom zip archive location of the package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
   */
  public fun sbom(): Any? = unwrap(this).getSbom()

  /**
   * Metadata that can be used to manage the package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the new package version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
   */
  public fun versionName(): String? = unwrap(this).getVersionName()

  /**
   * A builder for [CfnSoftwarePackageVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifact The artifact location of the package version.
     */
    public fun artifact(artifact: IResolvable)

    /**
     * @param artifact The artifact location of the package version.
     */
    public fun artifact(artifact: CfnSoftwarePackageVersion.PackageVersionArtifactProperty)

    /**
     * @param artifact The artifact location of the package version.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7ef3104ae9c3a08fd4c4bd4c5c22ee54c86055e33ee5b7873dccaea0357dcf2")
    public
        fun artifact(artifact: CfnSoftwarePackageVersion.PackageVersionArtifactProperty.Builder.() -> Unit)

    /**
     * @param attributes Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     */
    public fun attributes(attributes: Map<String, String>)

    /**
     * @param attributes Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     */
    public fun attributes(attributes: IResolvable)

    /**
     * @param description A summary of the package version being created.
     * This can be used to outline the package's contents or purpose.
     */
    public fun description(description: String)

    /**
     * @param packageName The name of the associated software package. 
     */
    public fun packageName(packageName: String)

    /**
     * @param recipe The inline json job document associated with a software package version.
     */
    public fun recipe(recipe: String)

    /**
     * @param sbom The sbom zip archive location of the package version.
     */
    public fun sbom(sbom: IResolvable)

    /**
     * @param sbom The sbom zip archive location of the package version.
     */
    public fun sbom(sbom: CfnSoftwarePackageVersion.SbomProperty)

    /**
     * @param sbom The sbom zip archive location of the package version.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4114a47eb080d40b064fe721b7c6d8c78690379b0e84aa7b52a4859bb401b654")
    public fun sbom(sbom: CfnSoftwarePackageVersion.SbomProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata that can be used to manage the package version.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that can be used to manage the package version.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param versionName The name of the new package version.
     */
    public fun versionName(versionName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps.Builder =
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps.builder()

    /**
     * @param artifact The artifact location of the package version.
     */
    override fun artifact(artifact: IResolvable) {
      cdkBuilder.artifact(artifact.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param artifact The artifact location of the package version.
     */
    override fun artifact(artifact: CfnSoftwarePackageVersion.PackageVersionArtifactProperty) {
      cdkBuilder.artifact(artifact.let(CfnSoftwarePackageVersion.PackageVersionArtifactProperty.Companion::unwrap))
    }

    /**
     * @param artifact The artifact location of the package version.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7ef3104ae9c3a08fd4c4bd4c5c22ee54c86055e33ee5b7873dccaea0357dcf2")
    override
        fun artifact(artifact: CfnSoftwarePackageVersion.PackageVersionArtifactProperty.Builder.() -> Unit):
        Unit = artifact(CfnSoftwarePackageVersion.PackageVersionArtifactProperty(artifact))

    /**
     * @param attributes Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     */
    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    /**
     * @param attributes Metadata that can be used to define a package version’s configuration.
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param description A summary of the package version being created.
     * This can be used to outline the package's contents or purpose.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param packageName The name of the associated software package. 
     */
    override fun packageName(packageName: String) {
      cdkBuilder.packageName(packageName)
    }

    /**
     * @param recipe The inline json job document associated with a software package version.
     */
    override fun recipe(recipe: String) {
      cdkBuilder.recipe(recipe)
    }

    /**
     * @param sbom The sbom zip archive location of the package version.
     */
    override fun sbom(sbom: IResolvable) {
      cdkBuilder.sbom(sbom.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sbom The sbom zip archive location of the package version.
     */
    override fun sbom(sbom: CfnSoftwarePackageVersion.SbomProperty) {
      cdkBuilder.sbom(sbom.let(CfnSoftwarePackageVersion.SbomProperty.Companion::unwrap))
    }

    /**
     * @param sbom The sbom zip archive location of the package version.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4114a47eb080d40b064fe721b7c6d8c78690379b0e84aa7b52a4859bb401b654")
    override fun sbom(sbom: CfnSoftwarePackageVersion.SbomProperty.Builder.() -> Unit): Unit =
        sbom(CfnSoftwarePackageVersion.SbomProperty(sbom))

    /**
     * @param tags Metadata that can be used to manage the package version.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata that can be used to manage the package version.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param versionName The name of the new package version.
     */
    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps,
  ) : CdkObject(cdkObject),
      CfnSoftwarePackageVersionProps {
    /**
     * The artifact location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-artifact)
     */
    override fun artifact(): Any? = unwrap(this).getArtifact()

    /**
     * Metadata that can be used to define a package version’s configuration.
     *
     * For example, the S3 file location, configuration options that are being sent to the device or
     * fleet.
     *
     * The combined size of all the attributes on a package version is limited to 3KB.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-attributes)
     */
    override fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * A summary of the package version being created.
     *
     * This can be used to outline the package's contents or purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the associated software package.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-packagename)
     */
    override fun packageName(): String = unwrap(this).getPackageName()

    /**
     * The inline json job document associated with a software package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-recipe)
     */
    override fun recipe(): String? = unwrap(this).getRecipe()

    /**
     * The sbom zip archive location of the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-sbom)
     */
    override fun sbom(): Any? = unwrap(this).getSbom()

    /**
     * Metadata that can be used to manage the package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the new package version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-softwarepackageversion.html#cfn-iot-softwarepackageversion-versionname)
     */
    override fun versionName(): String? = unwrap(this).getVersionName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSoftwarePackageVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps):
        CfnSoftwarePackageVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSoftwarePackageVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSoftwarePackageVersionProps):
        software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iot.CfnSoftwarePackageVersionProps
  }
}
