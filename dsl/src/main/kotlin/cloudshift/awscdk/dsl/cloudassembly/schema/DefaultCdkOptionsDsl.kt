@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.DefaultCdkOptions
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class DefaultCdkOptionsDsl {
    private val cdkBuilder: DefaultCdkOptions.Builder = DefaultCdkOptions.builder()

    private val _stacks: MutableList<String> = mutableListOf()

    public fun all(all: Boolean) {
        cdkBuilder.all(all)
    }

    public fun app(app: String) {
        cdkBuilder.app(app)
    }

    public fun assetMetadata(assetMetadata: Boolean) {
        cdkBuilder.assetMetadata(assetMetadata)
    }

    public fun caBundlePath(caBundlePath: String) {
        cdkBuilder.caBundlePath(caBundlePath)
    }

    public fun color(color: Boolean) {
        cdkBuilder.color(color)
    }

    public fun context(context: Map<String, String>) {
        cdkBuilder.context(context)
    }

    public fun debug(debug: Boolean) {
        cdkBuilder.debug(debug)
    }

    public fun ec2Creds(ec2Creds: Boolean) {
        cdkBuilder.ec2Creds(ec2Creds)
    }

    public fun ignoreErrors(ignoreErrors: Boolean) {
        cdkBuilder.ignoreErrors(ignoreErrors)
    }

    public fun json(json: Boolean) {
        cdkBuilder.json(json)
    }

    public fun lookups(lookups: Boolean) {
        cdkBuilder.lookups(lookups)
    }

    public fun notices(notices: Boolean) {
        cdkBuilder.notices(notices)
    }

    public fun output(output: String) {
        cdkBuilder.output(output)
    }

    public fun pathMetadata(pathMetadata: Boolean) {
        cdkBuilder.pathMetadata(pathMetadata)
    }

    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    public fun proxy(proxy: String) {
        cdkBuilder.proxy(proxy)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun stacks(vararg stacks: String) {
        _stacks.addAll(listOf(*stacks))
    }

    public fun stacks(stacks: Collection<String>) {
        _stacks.addAll(stacks)
    }

    public fun staging(staging: Boolean) {
        cdkBuilder.staging(staging)
    }

    public fun strict(strict: Boolean) {
        cdkBuilder.strict(strict)
    }

    public fun trace(trace: Boolean) {
        cdkBuilder.trace(trace)
    }

    public fun verbose(verbose: Boolean) {
        cdkBuilder.verbose(verbose)
    }

    public fun versionReporting(versionReporting: Boolean) {
        cdkBuilder.versionReporting(versionReporting)
    }

    public fun build(): DefaultCdkOptions {
        if (_stacks.isNotEmpty()) cdkBuilder.stacks(_stacks)
        return cdkBuilder.build()
    }
}
