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
import software.amazon.awscdk.cloudassembly.schema.IntegManifest
import software.amazon.awscdk.cloudassembly.schema.TestCase
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class IntegManifestDsl {
    private val cdkBuilder: IntegManifest.Builder = IntegManifest.builder()

    public fun enableLookups(enableLookups: Boolean) {
        cdkBuilder.enableLookups(enableLookups)
    }

    public fun synthContext(synthContext: Map<String, String>) {
        cdkBuilder.synthContext(synthContext)
    }

    public fun testCases(testCases: Map<String, TestCase>) {
        cdkBuilder.testCases(testCases)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): IntegManifest = cdkBuilder.build()
}
