@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.panorama

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance
import software.amazon.awscdk.services.panorama.CfnApplicationInstanceProps
import software.amazon.awscdk.services.panorama.CfnPackage
import software.amazon.awscdk.services.panorama.CfnPackageProps
import software.amazon.awscdk.services.panorama.CfnPackageVersion
import software.amazon.awscdk.services.panorama.CfnPackageVersionProps
import software.constructs.Construct

public object panorama {
  /**
   * Creates an application instance and deploys it to a device.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * CfnApplicationInstance cfnApplicationInstance = CfnApplicationInstance.Builder.create(this,
   * "MyCfnApplicationInstance")
   * .defaultRuntimeContextDevice("defaultRuntimeContextDevice")
   * .manifestPayload(ManifestPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build())
   * // the properties below are optional
   * .applicationInstanceIdToReplace("applicationInstanceIdToReplace")
   * .description("description")
   * .manifestOverridesPayload(ManifestOverridesPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build())
   * .name("name")
   * .runtimeRoleArn("runtimeRoleArn")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html)
   */
  public inline fun cfnApplicationInstance(
    scope: Construct,
    id: String,
    block: CfnApplicationInstanceDsl.() -> Unit = {},
  ): CfnApplicationInstance {
    val builder = CfnApplicationInstanceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Parameter overrides for an application instance.
   *
   * This is a JSON document that has a single key ( `PayloadData` ) where the value is an escaped
   * string representation of the overrides document.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * ManifestOverridesPayloadProperty manifestOverridesPayloadProperty =
   * ManifestOverridesPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestoverridespayload.html)
   */
  public inline
      fun cfnApplicationInstanceManifestOverridesPayloadProperty(block: CfnApplicationInstanceManifestOverridesPayloadPropertyDsl.() -> Unit
      = {}): CfnApplicationInstance.ManifestOverridesPayloadProperty {
    val builder = CfnApplicationInstanceManifestOverridesPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A application verion's manifest file.
   *
   * This is a JSON document that has a single key ( `PayloadData` ) where the value is an escaped
   * string representation of the application manifest ( `graph.json` ). This file is located in the
   * `graphs` folder in your application source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * ManifestPayloadProperty manifestPayloadProperty = ManifestPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-applicationinstance-manifestpayload.html)
   */
  public inline
      fun cfnApplicationInstanceManifestPayloadProperty(block: CfnApplicationInstanceManifestPayloadPropertyDsl.() -> Unit
      = {}): CfnApplicationInstance.ManifestPayloadProperty {
    val builder = CfnApplicationInstanceManifestPayloadPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnApplicationInstance`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * CfnApplicationInstanceProps cfnApplicationInstanceProps = CfnApplicationInstanceProps.builder()
   * .defaultRuntimeContextDevice("defaultRuntimeContextDevice")
   * .manifestPayload(ManifestPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build())
   * // the properties below are optional
   * .applicationInstanceIdToReplace("applicationInstanceIdToReplace")
   * .description("description")
   * .manifestOverridesPayload(ManifestOverridesPayloadProperty.builder()
   * .payloadData("payloadData")
   * .build())
   * .name("name")
   * .runtimeRoleArn("runtimeRoleArn")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-applicationinstance.html)
   */
  public inline fun cfnApplicationInstanceProps(block: CfnApplicationInstancePropsDsl.() -> Unit =
      {}): CfnApplicationInstanceProps {
    val builder = CfnApplicationInstancePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a package and storage location in an Amazon S3 access point.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * CfnPackage cfnPackage = CfnPackage.Builder.create(this, "MyCfnPackage")
   * .packageName("packageName")
   * // the properties below are optional
   * .storageLocation(StorageLocationProperty.builder()
   * .binaryPrefixLocation("binaryPrefixLocation")
   * .bucket("bucket")
   * .generatedPrefixLocation("generatedPrefixLocation")
   * .manifestPrefixLocation("manifestPrefixLocation")
   * .repoPrefixLocation("repoPrefixLocation")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html)
   */
  public inline fun cfnPackage(
    scope: Construct,
    id: String,
    block: CfnPackageDsl.() -> Unit = {},
  ): CfnPackage {
    val builder = CfnPackageDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPackage`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * CfnPackageProps cfnPackageProps = CfnPackageProps.builder()
   * .packageName("packageName")
   * // the properties below are optional
   * .storageLocation(StorageLocationProperty.builder()
   * .binaryPrefixLocation("binaryPrefixLocation")
   * .bucket("bucket")
   * .generatedPrefixLocation("generatedPrefixLocation")
   * .manifestPrefixLocation("manifestPrefixLocation")
   * .repoPrefixLocation("repoPrefixLocation")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-package.html)
   */
  public inline fun cfnPackageProps(block: CfnPackagePropsDsl.() -> Unit = {}): CfnPackageProps {
    val builder = CfnPackagePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * StorageLocationProperty storageLocationProperty = StorageLocationProperty.builder()
   * .binaryPrefixLocation("binaryPrefixLocation")
   * .bucket("bucket")
   * .generatedPrefixLocation("generatedPrefixLocation")
   * .manifestPrefixLocation("manifestPrefixLocation")
   * .repoPrefixLocation("repoPrefixLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-panorama-package-storagelocation.html)
   */
  public inline
      fun cfnPackageStorageLocationProperty(block: CfnPackageStorageLocationPropertyDsl.() -> Unit =
      {}): CfnPackage.StorageLocationProperty {
    val builder = CfnPackageStorageLocationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Registers a package version.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * CfnPackageVersion cfnPackageVersion = CfnPackageVersion.Builder.create(this,
   * "MyCfnPackageVersion")
   * .packageId("packageId")
   * .packageVersion("packageVersion")
   * .patchVersion("patchVersion")
   * // the properties below are optional
   * .markLatest(false)
   * .ownerAccount("ownerAccount")
   * .updatedLatestPatchVersion("updatedLatestPatchVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html)
   */
  public inline fun cfnPackageVersion(
    scope: Construct,
    id: String,
    block: CfnPackageVersionDsl.() -> Unit = {},
  ): CfnPackageVersion {
    val builder = CfnPackageVersionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPackageVersion`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.panorama.*;
   * CfnPackageVersionProps cfnPackageVersionProps = CfnPackageVersionProps.builder()
   * .packageId("packageId")
   * .packageVersion("packageVersion")
   * .patchVersion("patchVersion")
   * // the properties below are optional
   * .markLatest(false)
   * .ownerAccount("ownerAccount")
   * .updatedLatestPatchVersion("updatedLatestPatchVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-panorama-packageversion.html)
   */
  public inline fun cfnPackageVersionProps(block: CfnPackageVersionPropsDsl.() -> Unit = {}):
      CfnPackageVersionProps {
    val builder = CfnPackageVersionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
