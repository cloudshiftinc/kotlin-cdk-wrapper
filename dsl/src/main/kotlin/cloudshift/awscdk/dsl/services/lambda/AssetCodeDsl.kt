@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.BundlingOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.iam.IGrantable
import software.amazon.awscdk.services.lambda.AssetCode

/**
 * Lambda code from a local directory.
 *
 * Example:
 * ```
 * // Lambda function containing logic that evaluates compliance with the rule.
 * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
 * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .build();
 * // A custom rule that runs on configuration changes of EC2 instances
 * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
 * .configurationChanges(true)
 * .lambdaFunction(evalComplianceFn)
 * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
 * .build();
 * // A rule to detect stack drifts
 * CloudFormationStackDriftDetectionCheck driftRule = new
 * CloudFormationStackDriftDetectionCheck(this, "Drift");
 * // Topic to which compliance notification events will be published
 * Topic complianceTopic = new Topic(this, "ComplianceTopic");
 * // Send notification on compliance change events
 * driftRule.onComplianceChange("ComplianceChange", OnEventOptions.builder()
 * .target(new SnsTopic(complianceTopic))
 * .build());
 * ```
 */
@CdkDslMarker
public class AssetCodeDsl(
    path: String,
) {
    private val cdkBuilder: AssetCode.Builder = AssetCode.Builder.create(path)

    private val _exclude: MutableList<String> = mutableListOf()

    private val _readers: MutableList<IGrantable> = mutableListOf()

    /**
     * Specify a custom hash for this asset.
     *
     * If `assetHashType` is set it must be set to `AssetHashType.CUSTOM`. For consistency, this
     * custom hash will be SHA256 hashed and encoded as hex. The resulting hash will be the asset
     * hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and used for
     * optimizing and caching deployment activities related to this asset such as packaging,
     * uploading to Amazon S3, etc. If you chose to customize the hash, you will need to make sure
     * it is updated every time the asset changes, or otherwise it is possible that some deployments
     * will not be invalidated.
     *
     * Default: - based on `assetHashType`
     *
     * @param assetHash Specify a custom hash for this asset.
     */
    public fun assetHash(assetHash: String) {
        cdkBuilder.assetHash(assetHash)
    }

    /**
     * Specifies the type of hash to calculate for this asset.
     *
     * If `assetHash` is configured, this option must be `undefined` or `AssetHashType.CUSTOM`.
     *
     * Default: - the default is `AssetHashType.SOURCE`, but if `assetHash` is explicitly specified
     * this value defaults to `AssetHashType.CUSTOM`.
     *
     * @param assetHashType Specifies the type of hash to calculate for this asset.
     */
    public fun assetHashType(assetHashType: AssetHashType) {
        cdkBuilder.assetHashType(assetHashType)
    }

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker container is responsible for
     * putting content at `/asset-output`. The content at `/asset-output` will be zipped and used as
     * the final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file, archived into
     * a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     *   bundling provider.
     */
    public fun bundling(bundling: BundlingOptionsDsl.() -> Unit = {}) {
        val builder = BundlingOptionsDsl()
        builder.apply(bundling)
        cdkBuilder.bundling(builder.build())
    }

    /**
     * Bundle the asset by executing a command in a Docker container or a custom bundling provider.
     *
     * The asset path will be mounted at `/asset-input`. The Docker container is responsible for
     * putting content at `/asset-output`. The content at `/asset-output` will be zipped and used as
     * the final asset.
     *
     * Default: - uploaded as-is to S3 if the asset is a regular file or a .zip file, archived into
     * a .zip file and uploaded to S3 otherwise
     *
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     *   bundling provider.
     */
    public fun bundling(bundling: BundlingOptions) {
        cdkBuilder.bundling(bundling)
    }

    /**
     * Whether or not the asset needs to exist beyond deployment time;
     *
     * i.e. are copied over to a different location and not needed afterwards. Setting this property
     * to true has an impact on the lifecycle of the asset, because we will assume that it is safe
     * to delete after the CloudFormation deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during deployment. Therefore,
     * it is not necessary to store the asset in S3, so we consider those deployTime assets.
     *
     * Default: false
     *
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
     */
    public fun deployTime(deployTime: Boolean) {
        cdkBuilder.deployTime(deployTime)
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
     * `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
     * `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     *
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3.
     */
    public fun readers(vararg readers: IGrantable) {
        _readers.addAll(listOf(*readers))
    }

    /**
     * A list of principals that should be able to read this asset from S3.
     *
     * You can use `asset.grantRead(principal)` to grant read permissions later.
     *
     * Default: - No principals that can read file asset.
     *
     * @param readers A list of principals that should be able to read this asset from S3.
     */
    public fun readers(readers: Collection<IGrantable>) {
        _readers.addAll(readers)
    }

    public fun build(): AssetCode {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_readers.isNotEmpty()) cdkBuilder.readers(_readers)
        return cdkBuilder.build()
    }
}
